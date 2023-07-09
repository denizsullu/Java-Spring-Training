package throwDemo;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("", "Süllü", 25);
		AcoountManager manager = new AcoountManager();
		
		try {
			manager.control(person);
		} catch (EmptException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
