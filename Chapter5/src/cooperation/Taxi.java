package cooperation;

public class Taxi {
	
	int taxiNumber;
	int money;

	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public void take(int money) {
		this.money += money;
	}

	public void showTaxiInfo() {
		System.out.println(taxiNumber + "번 택시 수입은 " + money + "원");
	}

}
