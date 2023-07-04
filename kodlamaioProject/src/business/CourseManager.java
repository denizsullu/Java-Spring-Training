package business;

import java.lang.System.Logger;
import java.util.ArrayList;

import core.logging.ILogger;
import dataAccsess.Course.ICourseDao;
import entities.Course;

public class CourseManager implements ICourseService {

	private ICourseDao[] courseDao;
	private ILogger[] iLoggers;
	private ArrayList<Course> courseArray = new ArrayList<Course>();

	public CourseManager(ICourseDao[] courseDao, ILogger[] iLoggers) {
		super();
		this.courseDao = courseDao;
		this.iLoggers = iLoggers;
	}

	@Override
	public void add(Course course) throws Exception {
		if(course.getCoursPrice()<10) {
			throw new Exception("kurs fiyatı düşük");
		}
		for (Course q : courseArray) {
			if(q.getCoursName().equals(course.getCoursName())) {
				throw new Exception("kurs adı tekrar edemez ");
			}
		}
		
		for (Course q : courseArray) {
			System.out.println(q.getCoursName()+ "************************");
		}
		courseArray.add(course);
		for (ICourseDao q : courseDao) {
			q.add(course);
		}
		for (ILogger q : iLoggers) {
			q.log(course.getCoursName());
		}
		
	}
}
