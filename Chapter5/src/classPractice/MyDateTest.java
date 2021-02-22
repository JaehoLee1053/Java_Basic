package classPractice;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate(31, 1, 2017);
		
		if(date.isValid()) System.out.println("Valid");
		else System.out.println("inValid");

	}

}
