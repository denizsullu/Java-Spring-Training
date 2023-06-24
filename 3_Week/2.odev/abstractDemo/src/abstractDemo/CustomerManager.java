package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager _denizcex;
	public CustomerManager(BaseDatabaseManager denizcex) {
		_denizcex = denizcex;
	}
	 private BaseDatabaseManager denizcex;
	
	
	public void getCustomers() {
		_denizcex.getData();
	}
}
