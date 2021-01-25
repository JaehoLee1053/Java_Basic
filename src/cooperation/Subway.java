package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) { // 승차
		this.money += money;
		this.passengerCount++;
	}

	public void showSubwayInfo() {
		System.out.println(this.lineNumber+"번 지하철 승객은 "+this.passengerCount+"명 입니다.");
	}
}
