package business;

import entities.Campaign;
import entities.Product;

public class OrderManager implements IOrderService{
	private static final Campaign Campaign = null;
	ICampaignService campaign;
	
	public OrderManager(ICampaignService campaign) {
		super();
		this.campaign = campaign;
	}

	@Override
	public void sell(Product product) {
		System.out.println("Ürün bu fiyattadır :"+product.getProductPrice());
		System.out.println("İndirim eklendi :" + campaign.discount());
	}

	
	

}
