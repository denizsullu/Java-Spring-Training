package core.logging;

public class FileLogger implements ILogger{

	@Override
	public void log(String deniz) {
		System.out.println("Dosyaya başarıyla loglandı :" + deniz);
		 
	}

}
