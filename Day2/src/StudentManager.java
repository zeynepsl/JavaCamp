
public class StudentManager {
	public void Add(Student student) {
		System.out.println(student.email +  " email'e sahip öğrenci eklendi");
	}
	
	public void Delete(Student student) {
		System.out.println(student.email +  " email'e sahip öğrenci silindi");
	}
	
	public void Update(Student student) {
		System.out.println(student.email +  " email'e sahip öğrenci güncellendi");
	}
}
