package edu.jspider.filehandling.operations;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CharStreamWriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D://File//demo1.txt");
		if(file.exists())
		{
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("Hello Akash ");
			fileWriter.close();
			System.out.println("data is written to a file");
			
		}
		else
		{
			file.createNewFile();
			System.out.println("File is Created");
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("Hello World");
			fileWriter.close();
			System.out.println("data is written to a file");
			
		}
		
		

	}

}
