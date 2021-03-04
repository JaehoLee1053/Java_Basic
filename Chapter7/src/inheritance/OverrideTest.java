package inheritance;

public class OverrideTest {

	public static void main(String[] args) {

		Customer customerKim = new Customer(10010, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.calcPrice(10000));
		System.out.println(customerKim.showCustomerInfo());
		System.out.println();
		
		VIPCustomer customerLee= new VIPCustomer(10020, "이순신");
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.calcPrice(10000));
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		
		Customer customerNo= new VIPCustomer(10030, "노");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.calcPrice(10000));
		System.out.println(customerNo.showCustomerInfo());
		System.out.println();
		
	}

}
