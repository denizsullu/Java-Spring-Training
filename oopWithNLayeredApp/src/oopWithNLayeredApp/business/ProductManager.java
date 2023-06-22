package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dateAccess.HibernateProductDao;
import oopWithNLayeredApp.dateAccess.JdbcProductDao;
import oopWithNLayeredApp.dateAccess.ProdcutDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProdcutDao productDao;
	
	
	
	public ProductManager(ProdcutDao productDao) {
		this.productDao = productDao;
	}



	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz");
		}
		
		
		productDao.add(product);
		}
}
