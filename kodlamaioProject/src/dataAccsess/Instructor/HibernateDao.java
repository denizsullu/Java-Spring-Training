package dataAccsess.Instructor;

import entities.Category;
import entities.Instructor;

public class HibernateDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına başarıyla yazıldı. :" + instructor.getFirstName());
		
	}


}
