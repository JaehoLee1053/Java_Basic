package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.korea.setSubject("korea", 70);
		studentLee.math.setSubject("math", 70);

		Student studentKim = new Student(101, "Kim");
		studentKim.korea.setSubject("korea", 80);
		studentKim.math.setSubject("math", 100);

		studentKim.showStudentScore();
		studentLee.showStudentScore();

	}

}
