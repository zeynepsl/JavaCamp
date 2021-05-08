package staticDemo;

//ürün ekleyecek ortam
public class ProductManager {
	//product ý veri eriþm katmanýna (db ye ) gönder
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		if(validator.isValid(product)) {
			System.out.println("eklendi");
		}
		else {
			System.out.println("geçersiz bilgi");
		}
		
	}
}
