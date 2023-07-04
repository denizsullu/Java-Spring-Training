package business;

import java.util.ArrayList;

import core.logging.ILogger;
import dataAccsess.Instructor.InstructorDao;
import dataAccsess.category.ICategoryDao;
import entities.Category;

public class CategoryManager implements ICategoryService {
	private ICategoryDao categoryDao;
	private Category category;
	private ILogger[] iLogger;
	private ArrayList<Category> categoryArray = new ArrayList<Category>();

	public CategoryManager(ICategoryDao categoryDao, Category category, ILogger[] iLogger) {
		super();
		this.categoryDao = categoryDao;
		this.category = category;
		this.iLogger = iLogger;
	}

	@Override
	public void add() throws Exception {
		for (Category q : categoryArray) {
			if (q.getCategoryName().toLowerCase().equals(category.getCategoryName().toLowerCase())) {
				throw new Exception("Kategori ismi tekrar ediyor.");
			}
		}
		categoryArray.add(category);
		System.out.println("Categori array eklendi");
		for (ILogger q : iLogger) {
			q.log(category.getCategoryName());
		}
		categoryDao.add(category);

	}

}
