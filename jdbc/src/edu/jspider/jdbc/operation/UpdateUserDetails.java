package edu.jspider.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUserDetails {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
 	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		openConnection();
		
		String updateUser=" update user set password='Akash@10112' where uid=1";
		statement=connection.createStatement();
		int rows=statement.executeUpdate(updateUser);
		System.out.println(rows+"rows affected");
		
		closeConnection();
	}
	
	public static void openConnection() throws ClassNotFoundException, SQLException
	{
		// load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver=new com.mysql.cj.jdbc.Driver();
		//register Driver
		DriverManager.registerDriver(driver);
		
		//Create connection
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		connection=DriverManager.getConnection(url, user, password);
	
	}
	public static void closeConnection() throws SQLException
	{
		if(statement!=null)
		{
			statement.close();
		}
		if(connection!=null)
		{
			connection.close();
		}
		if(driver!=null)
		{
			DriverManager.deregisterDriver(driver);
		}
	}

}
