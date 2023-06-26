package kodlamaioBackend.dataAccess;

import kodlamaioBackend.core.logging.DatabaseLogger;
import kodlamaioBackend.core.logging.Logger;


public class HibernateDao implements CoursesDao {
	private Logger[] _log;
	public HibernateDao(Logger[] log) {
		this._log=log;
	}
	 
	@Override
	public void writeDatabase() {
		System.out.println("Hibernate ile veritabanına yazıldı");
		for (Logger logger : _log) {
			logger.log();
		}
		
	}

}
