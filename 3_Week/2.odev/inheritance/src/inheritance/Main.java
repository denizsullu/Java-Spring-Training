package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		employee.salary = 11;
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		employeeManager.BestEmployee();
	}

}
