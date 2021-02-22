package reference;

public class Student {

	int studentID;
	String stdentName;

	Subject korea;
	Subject math;

	public Student(int id, String name) {
		studentID = id;
		stdentName = name;

		korea = new Subject();
		math = new Subject();
	}

	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(stdentName+"의 총점 : " + total);
	}
}
