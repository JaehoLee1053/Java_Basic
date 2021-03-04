package polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;

	private int agentId;

//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 호출");
//	}

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;

		return (int)(price * (1 - salesRatio));
		
	}

}
