package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager  implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " adlý oyun, " + gamer.getFirstName() + "adlý kiþiye satýldý");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(
				game.getName() + " adlý oyun, " + 
		        gamer.getFirstName() + " adlý kiþiye, " + 
				campaign.getName() + " kampanyasý kapsamýnda " + 
			    "% " + campaign.getDiscountRate() + " indirim oraný ile " + 
		        discountedPrice(game.getUnitPrice(), campaign.getDiscountRate()) + " fiyata satýldý");
		
	}
	
	private double discountedPrice(double unitPrice, double discount) {
		return unitPrice - ((unitPrice * discount) / 100);
	}

}
