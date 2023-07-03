package business;

import entities.Person;

public interface IPersonService {
	void update(Person person);
	void add(Person person);
	void remove(Person person);
}
