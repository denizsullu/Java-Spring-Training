package kodlamaioBackend.business;

import kodlamaioBackend.dataAccess.CoursesDao;
import kodlamaioBackend.dataAccess.HibernateDao;
import kodlamaioBackend.entities.Courses;

public class CoursesManager {
	private CoursesDao courses;
	public CoursesManager(CoursesDao courses ) {
		this.courses = courses;
	}
	
	public void add(Courses course) {
		if(course.getCoursesPrice()<10 ) {
			System.out.println("Error");
		}
		else {
			System.out.println("Kurs bir problem yok" + course.getCoursesName());
			courses.writeDatabase();
		}
	}
}
