package business;

import entities.Person;

public class UserValidationManager implements IUserValidation {

	@Override
	public boolean Validate(Person person) {
		if(person.getIdentityNumber().equals("12345") && person.getFirstName().equals("deniz")) {
			return true;
			
		}
		else {
			return false;
		}
	
		
	}

}
