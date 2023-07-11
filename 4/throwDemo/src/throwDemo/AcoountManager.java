package throwDemo;

public class AcoountManager {
	
	
	public void control(Person person) throws EmptException {
		if(person.getName().isEmpty()){
			throw new EmptException("Ad boş girilemez");
		}
		else {
			System.out.println("doğru");
		}
		
	}

	
	
	
}
