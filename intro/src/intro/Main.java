package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("denizce");
		String ortaMetin = "İLginizi çekebilir";
		String altMetin = "Vade Süresi";
		System.out.println(ortaMetin + " " + altMetin);
		
		int vade = 12;
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		System.out.println(vade);
		System.out.println(dolarDustuMu);
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}	
		else { 
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//ARRAY
		String[] krediler = {"Hızlı Kredi","Maaşını Halk Bank Alanlar","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
