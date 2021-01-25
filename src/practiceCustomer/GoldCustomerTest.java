package practiceCustomer;

import java.util.ArrayList;

public class GoldCustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		VIPCustomer VIPCustomer = new VIPCustomer(1000, "VIP");
		GoldCustomer GOLDCustomer1 = new GoldCustomer(1000, "Gold1");
		GoldCustomer GOLDCustomer2 = new GoldCustomer(1000, "Gole2");
		Customer SILVERCustomer1 = new Customer(1000, "Silver1");
		Customer SILVERCustomer2 = new Customer(1000, "Silver2");

		customerList.add(VIPCustomer);
		customerList.add(GOLDCustomer1);
		customerList.add(GOLDCustomer2);
		customerList.add(SILVERCustomer1);
		customerList.add(SILVERCustomer2);
		
		for(Customer it : customerList) {
			System.out.print(it.getCustomerName() + " ");
			System.out.println(it.calcPrice(10000));
		}

	}

}
