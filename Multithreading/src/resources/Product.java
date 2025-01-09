package resources;

public class Product  {
	private int quantity;

	/**
	 * @param quantity
	 */
	public Product(int quantity) {
		this.quantity = quantity;
	}
	 public void comsume() {
		if(quantity>0)
			this.quantity --;
		else {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		 System.out.println("Consumer Consume one product");
	}
	 /**
	 * @param quantity
	 */
	
	public void producer()
	{
		this.quantity++;
		 System.out.println("Producer Produce the product");

		if(quantity==1)
			notify();
	}

}
