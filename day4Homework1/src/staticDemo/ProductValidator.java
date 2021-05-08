package staticDemo;

public class ProductValidator {
	
	/*static() {
    	System.out.println("statik yapýcý");
	}
    
    static() {
    	System.out.println("statik yapýcý");
	} 
	 * */
    
	
	public static boolean isValid(Product product) {
		if(!product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Bu metot static deðil bunu kullanabþlmem çiin class ý new lemem gerekiyor
	public void biSeyYap() {
		
	}
	
	//inner class:
	public static class Baska{
		public static void sil() {}
	}
	//gruplama için kullanýlýr
	
}
