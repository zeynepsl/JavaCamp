
public class SayiBulma {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}

	private static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5};
		int aranacak = 3;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi = true;
				break;
			}
			System.out.println("sayi hala aranmaya devam ediyor");
		}
		
		if(varMi) {
			mesajVer("sayi bulundu" + aranacak);//toplama iþleminin sonunda tek bir String oluþtu
		}
		else {
			mesajVer("sayi bulunamadi" + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
