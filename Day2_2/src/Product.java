
public class Product {
	
	//overloading:
	public Product() {
		
	}
	public Product(int id, String name, double unitPrice, String detail) {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	// attribute | field
	int id;
	String name;
	double unitPrice;
	String detail;
	String code;

	//getter
	public double getUnitPrice() {
		return unitPrice;
	}

	//setter
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Code bilgisi sadece okunabilir, deðiþtirilemez:
	public String getCode() {
		return this.name.substring(0,1) + id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
