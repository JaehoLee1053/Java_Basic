package inheritancePractice;

public class GoldCustomer extends Customer {

	double salseRatio;

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);

		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salseRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price*(1-salseRatio));
	}

}
