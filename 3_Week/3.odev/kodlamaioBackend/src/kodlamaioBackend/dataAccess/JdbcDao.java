package kodlamaioBackend.dataAccess;

import kodlamaioBackend.core.logging.Logger;

public class JdbcDao implements CoursesDao{
	Logger log;
	public JdbcDao(Logger log) {
		this.log =log;
	}
	@Override
	public void writeDatabase() {
		
		System.out.println("Jdbc ile veritabanına yazıldı");
		log.log();
		
		
	}

}
