package day3Homework2;

public class Main {

	public static void main(String[] args) {
		User student1 = new Student();
		student1.setId(1);
		student1.setFirstName("zeynep");
		student1.setLastName("eda");
		student1.setEmail("zeynep@zeynep.com");
		student1.setPassword("123");
		
		User instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("engin");
		instructor1.setLastName("demiroğ");
		instructor1.setEmail("engin@engin.com");
		instructor1.setPassword("456");
		
		User[] users = new User[] {student1, instructor1};
		
		BaseUserManager baseUserManager = new BaseUserManager();
		baseUserManager.addMultiple(users);	
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.addComment("github hesabı: zeynepsl");
		studentManager.listAll(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.addCourse(1);
	}

}
