package business;

import entities.Person;

public class PersonManager implements IPersonService {
	private IUserValidation userValidation;
	
	public PersonManager(IUserValidation userValidation) {
		super();
		this.userValidation = userValidation;
	}

	@Override
	public void update(Person person) {
		System.out.println("Güncellendi");
		
	}

	@Override
	public void add(Person person) {
		if(userValidation.Validate(person)== true) {
			System.out.println("eklendi kullanıcı");
		}
		else {
			System.out.println("başarısız");
		}
		
	}

	@Override
	public void remove(Person person) {
		System.out.println("Silindi");
		
	}
	
}
