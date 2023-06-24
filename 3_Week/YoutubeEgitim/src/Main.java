
public class Main {

	public static void main(String[] args) {
		
		/*int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]); 
	
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		Customer customer = new Personel();
		Customer customer2 = new Company();
		customer.FirstName="deniz";
		customer2.FirstName="denizLTD";
	
	
		CustomerManager customerManager = new CustomerManager(customer);
		CustomerManager customerManager2 = new CustomerManager(customer2);
		customerManager.Save();
		customerManager.Delete();
		customerManager2.Save();
		customerManager2.Delete();
		*/
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
	
		
		
		
	}

}
