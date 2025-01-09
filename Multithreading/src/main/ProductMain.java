package main;

import resources.Product;
import thread.Consumer;
import thread.Producer;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product(2);
		Consumer consumer=new Consumer(product);
		consumer.start();
		
		Producer produce=new Producer(product);
		produce.start();
	}

}
