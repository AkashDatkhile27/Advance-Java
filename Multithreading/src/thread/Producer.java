package thread;

import resources.Product;

public class Producer extends Thread {

private Product product;

/**
 * @param product
 */
public Producer(Product product) {
	super();
	this.product = product;
}

@Override
 public void run()
 {
	product.producer();
 }

}
