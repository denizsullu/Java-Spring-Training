package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int mukemmelSayi = 8129;
		int toplam = 0;
		for (int i = 1; mukemmelSayi > i; i++) {
			if (mukemmelSayi % i == 0) {
				toplam = toplam + i;
			}

		}
		if (toplam == mukemmelSayi) {
			System.out.println("mükemmel sayi");
		} else {
			System.out.println("mükkemel sayı değildir");
		}

	}

}
