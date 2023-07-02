package Business;

import java.util.ArrayList;

import core.logging.Logger;
import dataAccess.KodlamaDao;
import entities.Category;

public class CategoryManager {
	private ArrayList<KodlamaDao> kodlama = new ArrayList<KodlamaDao>();
	private Category category;
	private ArrayList<Logger> logger = new ArrayList<Logger>();
	private ArrayList<Category> categoryList = new ArrayList<Category>();

	public CategoryManager(ArrayList<KodlamaDao> kodlama, Category category, ArrayList<Logger> logger) {
		super();
		this.kodlama = kodlama;
		this.category = category;
		this.logger = logger;
	}

	public void add(Category category) throws Exception {
		for (Category q : categoryList) {
			if (q.getCategory().equals(category.getCategory())) {
				throw new Exception("Kategori ismi aynı olamaz");
			}
		}
		System.out.println("Kategori başarıyla oluşturuldu");
		categoryList.add(category);
		for (KodlamaDao q : kodlama) {
			q.writeCategory(category);
		}
		System.out.println("******************");
		for (Logger q : logger) {
			q.log("Başarılı bir şekilde loglandı");
		}

	}

}
