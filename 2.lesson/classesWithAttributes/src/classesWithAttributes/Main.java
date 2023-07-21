package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"1","Asus",4400,3,"1ls");
		Product product2 = new Product();
		Product product3 = new Product("deniz","asus");
		/*
		product.setName("laptop");
		product.setId(1);
		product.setDescription("deneme");
		product.setPrice(5500);
		product.setStockAmount(3); */
		
	
	
		product.showInfos();
		product2.showInfos();
		product3.showInfos();
		

	}

}
