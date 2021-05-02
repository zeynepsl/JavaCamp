package day3Homework2;

public class StudentManager extends BaseUserManager{
	public void addComment(String yorum) {
		System.out.println(yorum + ": yorumu eklendi.");
	}
	
	public void deleteComment() {
		System.out.println("yorum silindi.");
	}
	
	public void updateComment() {
		System.out.println(": yorum guncellendi.");
	}
	
}
