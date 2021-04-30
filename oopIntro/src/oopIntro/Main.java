package oopIntro;

public class Main {	
	public static void main(String[] args) {
		//Product turunde, 
		//Product(int id, String name, double unitPrice, String detail) kurucu metodunu kullanarak,
		//product adinda bir nesne olusturduk:
		Product product= new Product(1, "lenovo", 1500, "bilg");
		
		Product product2= new Product();
		product2.id=2;
		product2.name="Lenovo V14";//veritabanindan metotla gelecek bu bilgiler
		
		Product product3= new Product();
		product3.id=3;
		product3.name="Hp";
		
		Product[] products = {product, product2, product3};
		
		//products ý gez, her birine product1 adi ver(product1, Product veri türünde)
		//döngü döndükçe eleman deðiþiyor
	    for (Product product1 : products) {
	    	System.out.println(product1.name);
		}
	    
		System.out.println(products.length);
		
		Category category1=new Category();
		category1.id=1;
		category1.name="bilgisayar";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="bahce";
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product);//product ýn bellek adresini gönderiyoruz
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		//1 kere yaz her yerden çaðýr
	}
}