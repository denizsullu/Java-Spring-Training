package entities;

public class Gamer extends Person{
	private int balance;
	public Gamer(String firstName, String lastName, String identityNumber, int birthDate, int balance) {
		super(firstName, lastName, identityNumber, birthDate);
		this.balance = balance;
	}

	
	
}
