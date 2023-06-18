
public class Main {

	public static void main(String[] args) {

		String asalMi = asalHesaplama(5);
		System.out.println(asalMi);
		int toplam = topla2(1,2,3,4,5);
		System.out.println(toplam);

	}

	public static String asalHesaplama(int sayi1) {
		boolean asalMi = true;
		for (int i = 2; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				asalMi = false;
				break;
			}
		}
		if (asalMi) {
			return "asal sayıdır";
		} else {
			return "değildir";
		}

	}
	public static int topla2(int... sayilar) {
	 int toplam = 0;
	 for(int sayi:sayilar) {
		 toplam +=sayi;
	 }
	 return toplam;
	}
}
