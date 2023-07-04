package dataAccsess.Course;

import entities.Course;

public class CourseHibernateDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına yazıldı :" + course.getCoursName());
		
	}

}
