package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements KodlamaDao {

	@Override
	public void writeInstructor(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına yazıldı : "+
	instructor.getFirstName()+" " + instructor.getLastName());
		
	}

	@Override
	public void writeCourse(Course course) {
		System.out.println("Hibernate ile kurs veritabanına yazıldı :"+
	course.getCoursName());
		
	}

	@Override
	public void writeCategory(Category category) {
		System.out.println("Hibernate ile kategori başarıyla veritabanına yazıldı : "
				+ category.getCategory());
		
	}

	

}
