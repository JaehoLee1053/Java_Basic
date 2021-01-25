package practiceCustomer;

public class GoldCustomer extends Customer {

	double salesRatio;

	public GoldCustomer(int customerID, String customerGrade) {
		super(customerID, customerGrade);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price = (int) (price * (1 - salesRatio));
	}

}
