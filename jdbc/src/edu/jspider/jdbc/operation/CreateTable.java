package edu.jspider.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Driver driver=new com.mysql.cj.jdbc.Driver();
		
		//register the driver
		 DriverManager.registerDriver(driver);
		 
		// create connection to the database
		 String url="jdbc:mysql://localhost:3306/test";
		 String dbName="test";
		 String user="root";
		 String password="root";
		 Connection connection=DriverManager.getConnection(url, user, password);
		
		 Statement statement= connection.createStatement();
		 
		 String createTable="create table user(uid int primary key,name varchar(20) not null,"
		 		+ " email varchar(20) not null unique,mobile bigint not null unique,password varchar(19) not null)";
		 
		 boolean res=statement.execute(createTable);
		 System.out.println(res);
			System.out.println("table Created");
		
		//6> close the connection
			statement.close();
			connection.close();
		
		//7> Deregister Diver
		 DriverManager.deregisterDriver(driver);
		
	}

}
