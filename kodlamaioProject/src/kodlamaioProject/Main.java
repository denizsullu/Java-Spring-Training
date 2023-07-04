package kodlamaioProject;

import business.CategoryManager;
import business.CourseManager;
import business.ICategoryService;
import business.ICourseService;
import business.InstructorManager;
import business.InstructorService;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import dataAccsess.Course.CourseHibernateDao;
import dataAccsess.Course.ICourseDao;
import dataAccsess.Instructor.HibernateDao;
import dataAccsess.Instructor.JdbcInstructorDao;
import dataAccsess.category.CategoryHibernateDao;
import dataAccsess.category.ICategoryDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		InstructorService instructorService = new InstructorManager(new HibernateDao(), new Instructor("deniz", "süllü", 25));
		instructorService.add();
		System.out.println("*******************************************");
		ILogger[] iLogger = {new FileLogger(), new DatabaseLogger()};
		CategoryManager categoryManager = new CategoryManager(new CategoryHibernateDao(), new Category("Programlama"), iLogger);
		categoryManager.add();
		System.out.println("*****************************************************");
		
		ICourseDao[] courseDao = {new CourseHibernateDao() };
		ICourseService courseService = new CourseManager(courseDao, iLogger);
		courseService.add(new Course("java", 15));
		courseService.add(new Course("java2", 15));
		
		
		
		
		
	}

}
