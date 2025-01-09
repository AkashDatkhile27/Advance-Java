package thread;

import resources.ThreadResource;

public class MyThread6 extends Thread {
	
	private ThreadResource resource;
	

	/**
	 * @param resource
	 */
	public MyThread6(ThreadResource resource) {
		super();
		this.resource = resource;
	}


	@Override
	public void run()
	{
		synchronized(resource.obj2) {
			System.out.println("Thread 2 is applied lock resource 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(resource.obj1) {
				System.out.println("Thread 1 is applied lock resource 2");
			}
		}
	}}
