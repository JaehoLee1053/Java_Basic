package practiceArray;

import java.util.ArrayList;

public class Student {

	private String studentName;
	private ArrayList<Book> bookList = new ArrayList<Book>();

	public Student(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void addBook(String bookName) {
		Book book = new Book(bookName);
		bookList.add(book);
	}

	public void showBookList() {
		System.out.print(studentName + "학생이 읽은 책은 : ");
		for (Book it : bookList) {
			System.out.print(it.getBookName() + " ");
		}
		System.out.println("입니다.");
	}

}
