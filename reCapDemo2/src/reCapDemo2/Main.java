package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6, 2.3 };
		double total = 0;
		double max = myList[0];
		for (double list : myList) {
			total = total + list;
			if (list > max) {
				max = list;
			}
			System.out.println(list);
		}
		System.out.println("toplam =" + total);
		System.out.println("en büyük sayı = " + max);

	}

}
