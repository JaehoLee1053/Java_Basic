package arrayListPractice2;

import java.util.ArrayList;

public class Student {

	String name;
	ArrayList<Book> bookList;

	public Student(String name) {
		this.name = name;
		bookList = new ArrayList<Book>();
	}

	public void addBook(String title) {
		Book book = new Book(title);
		this.bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(name+" 학생이 읽은 책은 : ");
		
		for(Book book:bookList) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println("입니다");
	}

}
