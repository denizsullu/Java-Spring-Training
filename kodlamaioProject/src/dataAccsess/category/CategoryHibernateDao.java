package dataAccsess.category;

import entities.Category;

public class CategoryHibernateDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına yazıldı :" + category.getCategoryName());
		
	}

}
