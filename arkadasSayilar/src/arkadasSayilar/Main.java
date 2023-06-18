package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		int total = 0;
		int total2 = 0;

		for (int i = 1; number1 > i; i++) {
			if (number1 % i == 0) {
				total += i;
			}

		}
		for (int i = 1; number2 > i; i++) {
			if (number2 % i == 0) {
				total2 += i;
			}

		}
		if (number1 == total2 && number2 == total) {
			System.out.println("arkadaş sayı");
		} else {
			System.out.println("arkadaş değil");
		}
	}

}
