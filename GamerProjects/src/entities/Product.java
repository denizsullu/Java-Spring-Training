package entities;

public class Product {
	private int productPrice;

	public Product(int productPrice) {
		super();
		this.productPrice = productPrice;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
}
