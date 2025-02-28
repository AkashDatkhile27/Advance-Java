package edu.jspider.serializationanddeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedUser {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File file=new File("D://File//User.txt");
		
		if(file.exists())
		{
			//creating object for file Input stream
			FileInputStream fileInputStream=new FileInputStream(file);
			
			//creating object for object input stream and passing object of file input stream 
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			//reading data from file by creating user object using downcasting
			User user=(User)objectInputStream.readObject();
			
			System.out.println(user);
			
			fileInputStream.close();
			objectInputStream.close();

		}
		else
		{
			System.out.println("Something went wrong");
		}
	
	}

}
