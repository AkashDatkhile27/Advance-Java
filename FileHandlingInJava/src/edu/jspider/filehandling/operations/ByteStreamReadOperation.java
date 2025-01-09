package edu.jspider.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReadOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File file=new File("D://File//demo2.txt");
			String data="";
			if(file.exists())
			{
				FileInputStream fileInputStream=new FileInputStream(file);
				int b=-1;
				while((b=fileInputStream.read())!=-1)
				{
					data+=(char)b;
				}
				System.out.println(data);
				fileInputStream.close();
			}
			else
			{
				System.out.println("File Does not exists");
			}
	}

}
