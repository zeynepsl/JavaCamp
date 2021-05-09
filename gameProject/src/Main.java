import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.UserCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "zeynep", "salman", "zeynep@zeynep.com", new Date(2002, 04, 10), "11122333");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		Game game = new Game(1, "abc", 100);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaign = new Campaign(1, "yaz indirimi", 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignSale(game, gamer, campaign);
	}

}
