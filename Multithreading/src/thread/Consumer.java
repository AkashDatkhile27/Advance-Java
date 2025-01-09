package thread;

import resources.Product;

public class Consumer extends Thread {

	private Product product;
	
/**
	 * @param product
	 */
	public Consumer(Product product) {
		super();
		this.product = product;
	}

@Override
	public void run()
	{
	
		try {
			product.comsume();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


}
