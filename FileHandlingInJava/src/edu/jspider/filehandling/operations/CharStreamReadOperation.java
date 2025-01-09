package edu.jspider.filehandling.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CharStreamReadOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D://File//demo1.txt");
		if(file.exists())
		{
			FileReader fileReader=new FileReader(file);
			int ascii=-1;
			String data="";
			while((ascii=fileReader.read())!=-1) {
				data+=(char)ascii;
			}
			
			fileReader.close();
			System.out.println(data);
			
		}
		else
		{
			System.out.println("File does not exists");
		}
	}

}
