package business;

import dataAccsess.Instructor.InstructorDao;
import entities.Instructor;

public class InstructorManager implements InstructorService{
	private InstructorDao instructorDao;
	private Instructor instructor;
	
	public InstructorManager(InstructorDao instructorDao, Instructor instructor) {
		super();
		this.instructorDao = instructorDao;
		this.instructor = instructor;
	}



	@Override
	public void add() {
		System.out.println("Veritabınana gönderilmek üzere kontrol ediliyor.");
		instructorDao.add(instructor);
	}

}
