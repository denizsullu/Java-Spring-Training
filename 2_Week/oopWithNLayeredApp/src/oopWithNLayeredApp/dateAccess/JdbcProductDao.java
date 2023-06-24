package oopWithNLayeredApp.dateAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProdcutDao{
	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır...SQL
		System.out.println("JDBS ile veritabanına eklendi");
	}
}


