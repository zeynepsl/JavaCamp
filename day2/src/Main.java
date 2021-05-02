
public class Main {

	public static void main(String[] args) {
		
		categoryTest();
		
		courseTest();
				
		studentTest();
	}

	private static void studentTest() 
	{
		Student student1 = new Student(1, "zeynep", "duru", "zeynep@duru.com", 123);
		Student student2 = new Student(1, "eda", "ipek", "eda@ipek.com", 456);
		
		Student[] students = {student1, student2};
		StudentManager studentManager = new StudentManager();
		
		for (Student student : students) {
			studentManager.Add(student);
		}
	}

	private static void courseTest() 
	{
		Course course1 = new Course(1, "java + react");
		Course course2 = new Course(2, "c# + angular");
		
		Course[] courses = {course1, course2};
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courses) {
			courseManager.Add(course);
		}
	}

	private static void categoryTest() 
	{
		Category category1 = new Category(1, "java");
		Category category2 = new Category(2, "c#");
		
		Category[] categories = {category1, category2};
		CategoryManager manager = new CategoryManager();
		
		for (Category category: categories) {
			manager.Add(category);
		}
	}

}
