package edu.jspider.filehandling.operations;
 import java.io.File;
public class DeleteFile {
	
	public static void main(String [] args) {
		
		File file=new File("D://File//demo1.txt");
		boolean isFileDeleted=file.delete();
		if(isFileDeleted)
			System.out.println("File is Deleted Successfully");
		else
			System.out.println("Something went wrong");

	}

}
