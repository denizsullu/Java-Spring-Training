
public class CustomerManager {
	private BaseLogger Logger;
	public CustomerManager(BaseLogger logger) {
		this.Logger = logger;
	}
	public void add() {
		System.out.println("Müşteri eklendi");
		this.Logger.log("Log mesajı");
		
	}
}
