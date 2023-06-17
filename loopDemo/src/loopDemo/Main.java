package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For loop
		for(int i=1; i<=10; i+=2) {
			System.out.println("deniz "+i);
		}
		System.out.println("For döngüsü bitti");
		// While
		int i=1;
		while (i<10) {
			System.out.println(i);
			i +=2;
		}
		System.out.println("While döngüsü bitti");
		
		// Do-While 
		int j=100;
		do {
			j+=1;
			System.out.println(j);
			
		} while (j<10);
		System.out.println("Do-While döngüsü bitti");
	}

}
