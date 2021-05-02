
public class Methods {

	public static void main(String[] args) {
		int toplam = Add(1,3,53,56,21);
		System.out.println(toplam);
	}
	
	//variable arguments
	//bunun yerine: koleksiyonlar ve nesnel yapýlar
	public static int Add(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
