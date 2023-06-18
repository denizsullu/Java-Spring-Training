package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
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
			mesajVer("string"+aranacak);
		} else {
			System.out.println("sayı sistemde yok :"+aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
