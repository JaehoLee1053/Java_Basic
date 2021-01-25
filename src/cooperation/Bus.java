package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) { // 승차
		this.money += money;
		this.passengerCount++;
	}

	public void showBusInfo() {
		System.out.println(busNumber+"번 버스 승객은 "+this.passengerCount+"명 입니다.");
	}

}
