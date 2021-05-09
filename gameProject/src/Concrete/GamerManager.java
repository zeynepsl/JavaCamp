package Concrete;
import Abstract.GamerService;
import Abstract.UserCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	UserCheckService checkService;
	public GamerManager(UserCheckService checkService) {
		this.checkService = checkService;
	}
	@Override
	public void add(Gamer gamer) {
		personControl(gamer);
		System.out.println(gamer.getFirstName() + " adlý kullanýcý eklendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý kullanýcý silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		personControl(gamer);
		System.out.println(gamer.getFirstName() + " adlý kullanýcý güncellendi");
	}
	
	//iþ kodu:
	private void personControl(Gamer gamer) {
		if(checkService.checkIfRealPerson(gamer)) {
			System.out.println("kullanýcý bulundu");
		}
		else {
			System.out.println("kullanýcý bulunamadý");
		}
	}
	
}
