package staticex;

public class StudentIDTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		// System.out.println(studentLee.getSerialNum());
		 System.out.println(Student.getSerialNum());
		 // static method는 클래스로 바로 불러올 수 있어서 class method라고도 함
		
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialNum());

		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());

	}

}
