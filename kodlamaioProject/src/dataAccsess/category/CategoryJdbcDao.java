package dataAccsess.category;

import entities.Category;

public class CategoryJdbcDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına yazıldı :" + category.getCategoryName());
		
	}
		
}
