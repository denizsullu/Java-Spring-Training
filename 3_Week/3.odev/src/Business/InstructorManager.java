package Business;

import java.util.ArrayList;

import dataAccess.KodlamaDao;
import entities.Instructor;

public class InstructorManager {
	private ArrayList<KodlamaDao> kodlamaDatabase;

	public InstructorManager(ArrayList<KodlamaDao> kodlamaDatabase) {
		super();
		this.kodlamaDatabase = kodlamaDatabase;
	}
	
	public void add(Instructor instructor) {
		System.out.println("Eğitmen başarıyla tanımlandı.");
		for(KodlamaDao q:kodlamaDatabase) {
			q.writeInstructor(instructor);
			}
		}

	
	
}
