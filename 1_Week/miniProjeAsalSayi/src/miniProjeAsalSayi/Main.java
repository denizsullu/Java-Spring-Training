package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 4;
		boolean isPrime = true;

		if (number <= 1) {
			if (number == 1) {
				System.out.println("asal değildir");
				return;
			} else {
				System.out.println("geçersiz bir sayı girdiniz");
				return;
			}

		}
		for (int i = 2; number > i; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("sayı asaldır");
		} else {
			System.out.println("sayı asal değildir");
		}

	}

}
