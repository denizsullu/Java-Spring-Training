package core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String deniz) {
		System.out.println("Veritabanına başarıyla loglandı :" + deniz);
		
	}

}
