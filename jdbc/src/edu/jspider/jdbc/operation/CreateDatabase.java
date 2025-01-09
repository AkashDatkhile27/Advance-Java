package edu.jspider.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		 	// 1> Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			Driver driver=new com.mysql.cj.jdbc.Driver();
		
		//Register the Driver
			DriverManager.registerDriver(driver);
			//format for url :- API:databaseserver://host:port/databasename
			// 	"jdbc:mysql://localhost:3306?user=root&password=root"
			String url="jdbc:mysql://localhost:3306";
			String user="root";
			String password="root";
		
		//2>open connection between my java and application
			Connection connection= DriverManager.getConnection(url,user,password);
		
		// 4>create or execute statement.
			Statement statement=connection.createStatement();
		
		//execute Statement
			String createDatabase="create database test" ;//create database query
			
			
			boolean res=statement.execute(createDatabase);
			
		// 5> Process the result
			System.out.println(res);
			System.out.println("Database Created");
		
		//6> close the connection
			statement.close();
			connection.close();
		
		//7> Deregister Diver
		 DriverManager.deregisterDriver(driver);
			
		
		
	}

}
