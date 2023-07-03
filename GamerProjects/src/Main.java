import business.CampaignManager;
import business.ICampaignService;
import business.IOrderService;
import business.IPersonService;
import business.OrderManager;
import business.PersonManager;
import business.UserValidationManager;
import entities.Campaign;
import entities.Gamer;
import entities.Person;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		IPersonService personManager = new PersonManager(new UserValidationManager());
		personManager.add(new Gamer("deniz", "Süllü", "12345", 1997, 0));
		
	IOrderService order = new OrderManager(new CampaignManager());
	order.sell(new Product(55));
	}

}
