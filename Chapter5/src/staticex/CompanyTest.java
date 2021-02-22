package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();

		// singleton pattern으로 호출하여 같은 method
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();

	}

}
