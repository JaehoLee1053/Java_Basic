package inheritancePractice;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer cutomerVIP = new VIPCustomer(1001, "VIP", 1001);
		customerList.add(cutomerVIP);

		Customer cutomerGold1 = new GoldCustomer(1002, "Gold1");
		Customer cutomerGold2 = new GoldCustomer(1003, "Gold2");
		customerList.add(cutomerGold1);
		customerList.add(cutomerGold2);

		Customer cutomerSilver1 = new Customer(1004, "Silver1");
		Customer cutomerSilver2 = new Customer(1005, "Silver2");
		customerList.add(cutomerSilver1);
		customerList.add(cutomerSilver2);

		for(Customer customer:customerList) {
			customer.bonusPoint = 1000;
			System.out.println(customer.showCustomerInfo());
		}

	}

}
