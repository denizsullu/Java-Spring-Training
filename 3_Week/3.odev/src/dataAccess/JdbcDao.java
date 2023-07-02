package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcDao implements KodlamaDao {

	@Override
	public void writeInstructor(Instructor instructor) {
		System.out.println("JDBC ile veritabanına yazıldı : "+
				instructor.getFirstName()+" "+ instructor.getLastName());
		
	}

	@Override
	public void writeCourse(Course course) {
		System.out.println("JDBC ile kurs veritabanına yazıldı :"+
				course.getCoursName());
		
	}

	@Override
	public void writeCategory(Category category) {
		System.out.println("JDBC ile kategori başarıyla veritabanına yazıldı : "
				+ category.getCategory());
		
	}

}
