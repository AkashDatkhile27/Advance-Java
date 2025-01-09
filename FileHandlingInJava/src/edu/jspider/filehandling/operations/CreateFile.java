package edu.jspider.filehandling.operations;

import java.io.File;
import java.io.IOException; 
public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			File file=new File("D:\\File\\demo1.txt");
			boolean fileIsCreate=file.createNewFile();
			if(fileIsCreate)
			System.out.println("file is created");
			else
				System.out.println("file is already exist");	
	}

}
