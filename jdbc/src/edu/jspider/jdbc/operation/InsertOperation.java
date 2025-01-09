package edu.jspider.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		openConnection();
		
		String insertUser="insert into user values(2,'Akash','ak@gmail.com',4286667898,'Ak@1011')";
		statement=connection.createStatement();
		
		int rows=statement.executeUpdate(insertUser);
		System.out.println(rows+" rows affected ");
		
		
		
		closeConnection();

	}
	
	
	private static void openConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		 
		String url="jdbc:mysql://localhost:3306/test";
		 String user="root";
		 String password="root";
		
		connection=DriverManager.getConnection(url,user,password);
		
	}
	
	
	private static void closeConnection() throws SQLException
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
