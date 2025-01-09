package edu.jspider.filehandling.operations;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharStreamReadOperationUsingScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D://File//demo1.txt");
		if(file.exists())
		{
			Scanner scanner=new Scanner(file);
			while(scanner.hasNextLine())
			{
				System.out.println(scanner.nextLine());
			}
			scanner.close();
			
		}
		else
		{
			System.out.println("File does not exists");
		}
	}

}
