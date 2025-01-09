package edu.jspider.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUser {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//open connection
		openConnection();
		
		//create statement
		statement=connection.createStatement();
		
		//execute Statement
		String deleteUser="delete from user where uid=2";
		int rows=statement.executeUpdate(deleteUser);
		if(rows==1)
			System.out.println("User Deleted Successfully");
		else
			System.out.println("something went Wrong");
	
		//close connection	
		closeConnection();
	}
	
	public static void openConnection() throws SQLException, ClassNotFoundException
	{
		//load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver=new com.mysql.cj.jdbc.Driver();
		//register Driver
		DriverManager.registerDriver(driver);
		
		//create connection
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		
		connection=DriverManager.getConnection(url,user,password);
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
