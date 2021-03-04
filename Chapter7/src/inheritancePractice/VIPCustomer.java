package inheritancePractice;

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

	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentId = agentId;
		System.out.println("VIPCustomer(int, String) 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;

		return (int) (price * (1 - salesRatio));

	}

	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점이고, 담담 점원은 " + agentId
				+ "입니다.";
	}

}
