package kodlamaioBackend.core.logging;

import kodlamaioBackend.entities.Courses;

public class DatabaseLogger implements Logger {

	@Override
	public void log() {
		System.out.println("Başarıyla database loglandı");
		
	}

}
