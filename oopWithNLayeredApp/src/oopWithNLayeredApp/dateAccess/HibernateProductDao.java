package oopWithNLayeredApp.dateAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProdcutDao {
	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır...SQL
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
