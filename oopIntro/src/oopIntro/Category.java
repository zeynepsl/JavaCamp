package oopIntro;

public class Category {
	private int id;
	private String name;

	public Category() {
	}
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//metot çalýþýnca ortaya çýkan veri türü, döndüreceði tür: int
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;//class daki ýd yi gelen id yap
	}
	
	public String getName() {
		return this.name + "!";
	}
	
	public void setName(String name) {
	     this.name=name;
	}
}
