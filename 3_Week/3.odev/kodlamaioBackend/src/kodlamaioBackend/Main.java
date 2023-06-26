package kodlamaioBackend;

import kodlamaioBackend.business.CoursesManager;
import kodlamaioBackend.core.logging.DatabaseLogger;
import kodlamaioBackend.core.logging.FileLoger;
import kodlamaioBackend.core.logging.Logger;
import kodlamaioBackend.dataAccess.HibernateDao;
import kodlamaioBackend.dataAccess.JdbcDao;
import kodlamaioBackend.entities.Courses;

public class Main {

	public static void main(String[] args) {
		Courses cour = new Courses("Engin Demiroğ","Yazılım","Java ile programlama",20);
		Logger[] log = {new DatabaseLogger(),new FileLoger()};
		CoursesManager manager = new CoursesManager(new HibernateDao(log));
		manager.add(cour);
	}

}
