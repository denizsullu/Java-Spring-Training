package dataAccsess.Instructor;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Başarıyla veitabanına eklendi :" + instructor.getFirstName() );
		
	}
	
}
