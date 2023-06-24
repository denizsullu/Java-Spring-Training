package classes;

public class Main {

	public static void main(String[] args) {
		//reference type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value
		int sayi1 =10;
		int sayi2 =20;
		sayi2 = sayi1;
		sayi1= 30;
		System.out.println(sayi2);
 
	}
	


}
