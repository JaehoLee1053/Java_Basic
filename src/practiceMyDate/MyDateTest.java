package practiceMyDate;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate d1 = new MyDate(2021, 1, 13);
		MyDate d2 = new MyDate(2021, 1, 13);
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());

	}
	
}
