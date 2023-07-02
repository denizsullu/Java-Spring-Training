package Business;

import java.util.ArrayList;

import dataAccess.KodlamaDao;
import entities.Course;

public class CoursManager {
	private ArrayList<Course> coursList = new ArrayList<Course>();
	private ArrayList<KodlamaDao> kodlamaDatabase;
	private Course cours;
	

	public CoursManager(ArrayList<KodlamaDao> kodlamaDatabase, Course cours) {
		super();
		this.kodlamaDatabase = kodlamaDatabase;
		this.cours = cours;
	}

	public void add(Course course) throws Exception {
		for(Course q:coursList) {
			if(q.getCoursName().equals(course.getCoursName())) {
				throw new Exception("Bu kurs daha önce tanımlandı");
			}
			if(course.getPrice()<0) {
				throw new Exception("Bu kursun fiyatı 0 dan küçük olamaz");
			}
		}
		System.out.println("Kursunuz başarılı bir şekilde oluşturulmuştur.");
		coursList.add(course);
		for(KodlamaDao q:kodlamaDatabase) {
			q.writeCourse(course);
		}
		
		
	}
}
