package main;

import resources.ThreadResource;
import thread.MyThread5;
import thread.MyThread6;

public class ThreadMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadResource resource=new ThreadResource();
		
		MyThread5 thread1=new MyThread5(resource);
		MyThread6 thread2=new MyThread6(resource);
		
		thread1.start();
		thread2.start();


	}

}
