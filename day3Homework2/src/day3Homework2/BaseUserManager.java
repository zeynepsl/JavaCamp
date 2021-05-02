package day3Homework2;

public class BaseUserManager {
	public BaseUserManager() {
	}
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý güncellendi.");
	}
	
	public void listAll(User[] users) {
		for (User user : users) {
			System.out.println("kullanýcý adý: " + user.getFirstName() + ", soyadý: " + user.getLastName());
		}
	}
}
