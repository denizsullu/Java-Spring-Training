
public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer ali,ICreditManager creditManager) {
		_customer = ali;
		_creditManager =creditManager;
	}

	public void Save() {
		System.out.println("Müşteri eklendi :");
	}
	public void Delete() {
		System.out.println("Müşteri Silindi :");
	}
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("kredi verildi");
	}
}
