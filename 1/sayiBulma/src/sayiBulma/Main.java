package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 3;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("sayi sistemde var");
		} else {
			System.out.println("sayı sistemde yok");
		}

	}

}
