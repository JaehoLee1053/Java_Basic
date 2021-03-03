package arrayListPractice;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");

		studentLee.addSubject("국어", 100);
		studentLee.addSubject("영어", 90);
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(1002, "Kim");

		studentKim.addSubject("국어", 80);
		studentKim.addSubject("영어", 80);
		studentKim.addSubject("수학", 20);

		studentKim.showStudentInfo();
		
	}

}