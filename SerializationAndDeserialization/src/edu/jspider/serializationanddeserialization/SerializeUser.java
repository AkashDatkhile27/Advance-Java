package edu.jspider.serializationanddeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class SerializeUser {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		String name=null;
		String email=null;
		Long mobile=0l;
		String address=null;
		
		//constructor with default value
		User user=new User(name,email,mobile,address);
		
		//creating file object
		File file=new File("D://File//User.txt");

		//accepting inputs from user
		name=scanner.next();
		email=scanner.next();
		mobile=scanner.nextLong();
		address=scanner.next();
		
		// assigning to user
		user.setName(name);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setAddress(address);




		if(!(file.exists())) 
		{
			file.createNewFile();
			System.out.println("File is Created");
			
			//creating object for file output stream
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			
			//createing object for object output stream and passing object of file output stream 
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			//writting  data to class file 
			objectOutputStream.writeObject(user);
			
			fileOutputStream.close();
			objectOutputStream.close();
			System.out.println("User it serialize");

		}
		else
		{
			FileOutputStream fileOutputStream=new FileOutputStream(file);//object of output stream
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(user);
			fileOutputStream.close();
			objectOutputStream.close();
			System.out.println("User it serialize");
			
		}


					
			
		
		

	}

}
