package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok güzel.";
		System.out.println(mesaj);

//		System.out.println("Eleman sayısı = " + mesaj.length());
//		System.out.println("Beşinci Eleman = " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaşasın!"));
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("a"));
//		System.out.println(mesaj.lastIndexOf("e"));
		
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj.substring(2,4));
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
	}

}
