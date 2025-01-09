package edu.jspider.filehandling.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] password={1,0,1,1};
		File file=new File("D://File//demo2.txt");
		if(file.exists())
		{
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(password);
			fileOutputStream.close();
			System.out.println("Data written to a file");
		}
		else
		{
			file.createNewFile();
			System.out.println("File Created Successfully");
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(28);
			fileOutputStream.close();
			System.out.println("Data written to a file");
		}
		}

	}


