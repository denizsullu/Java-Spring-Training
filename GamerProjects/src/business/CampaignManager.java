package business;

import entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya başarıyla eklendi" + campaign.getCampaignName() + campaign.getCampaignRate());
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}
	public int discount() {
		return 15;
		
	}
	

}
