package reference;

public class Student {

	int studentID;
	String studentName;
	int subjectID;

	Subject korea;
	Subject math;

	public Student(int id, String name) { // String이 아니고 다른 것의 경우에는 생성자를 만들어줘야 함
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}

	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}

	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}

	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " " + total);
	}

}
