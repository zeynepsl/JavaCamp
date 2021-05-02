
public class CourseManager {
	public void Add(Course course) {
		System.out.println(course.name +  " isimli kurs eklendi");
	}
	
	public void Delete(Course course) {
		System.out.println(course.name +  " isimli kurs silindi");
	}
	
	public void Update(Course course) {
		System.out.println(course.name +  " isimli kurs güncellendi");
	}
}
