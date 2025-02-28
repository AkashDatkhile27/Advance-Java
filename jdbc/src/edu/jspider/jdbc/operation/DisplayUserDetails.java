package edu.jspider.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayUserDetails {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step-1 - 3
		openConnection();
		
		String fetchUser="Select * from user ";
		//step-4
		//create Statement
		statement=connection.createStatement();
		
		//step-5
		//execute statement
		ResultSet resultSet=statement.executeQuery(fetchUser);
		while(resultSet.next())
		{
		int id=	resultSet.getInt("uid");
		String name=resultSet.getString("name");
		String email=resultSet.getString("email");
		long mobile=resultSet.getLong("mobile");
		String password=resultSet.getString("password");
		System.out.println("Id : "+id+"\nName : "+name+"\nEmail :" +email + "\nMobile Number : "+mobile+ " \nPassword : "+password);
		System.out.println("==============================================");
		}
		
		//step- 6 - 7
		closeConnection();
		
	}
	public static void openConnection() throws ClassNotFoundException, SQLException
	{
		// loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver=new com.mysql.cj.jdbc.Driver();
		//register driver
		DriverManager.registerDriver(driver);
		
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		//create connection
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
