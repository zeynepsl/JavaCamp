package oopIntro;

public class Product {
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	public Product() {
		System.out.println("ben çalıştım");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();//parametresiz kurucuyu çağırıyoruz
		this.id= id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
}
