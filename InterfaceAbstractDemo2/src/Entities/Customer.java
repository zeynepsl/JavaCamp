package Entities;


import Abstract.Entity;

public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private java.util.Date dateOfBirth;
	private String nationalityId;
	
	public Customer() {
	}
	
	public Customer(int id, String nationalityId, String firstName, String lastName, java.util.Date dateOfBirth) {
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(java.util.Date date) {
		this.dateOfBirth = date;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
