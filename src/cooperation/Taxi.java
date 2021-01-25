package cooperation;

public class Taxi {

	String taxiType;
	int money;

	public Taxi(String taxiType) {
		this.taxiType = taxiType;
	}

	public void take(int money) { // 승차
		this.money += money;
	}

	public void showTaxiInfo() {
		System.out.println(this.taxiType + "택시 탑승.");
	}

}
