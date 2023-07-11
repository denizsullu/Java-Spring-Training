import java.util.ArrayList;

import Business.CategoryManager;
import Business.CoursManager;
import Business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import dataAccess.KodlamaDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ArrayList<KodlamaDao> kodlamaDatabase = new ArrayList<KodlamaDao>();
		kodlamaDatabase.add(new HibernateDao());
		kodlamaDatabase.add(new JdbcDao()); 
		ArrayList<Logger> logger = new ArrayList<Logger>();
		logger.add(new FileLogger());
		logger.add(new DatabaseLogger());
		
		
		System.out.println("**************************************");
		Instructor instructor = new Instructor("Deniz","Süllü", 25);
		
		InstructorManager intructorManager = new InstructorManager(kodlamaDatabase);
		intructorManager.add(instructor);

		System.out.println("***********************************************");
		
		Course cours = new Course("Java", 100);
		
		CoursManager coursManager = new CoursManager(kodlamaDatabase, cours);
		coursManager.add(cours);
		
		System.out.println("************************************************************");
		Category category = new Category("Programlama");
	
		CategoryManager categoryManager = new CategoryManager(kodlamaDatabase, category,logger);
		categoryManager.add(category);
	
		
	}

}
