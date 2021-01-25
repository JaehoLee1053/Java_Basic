package template;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("시동 켜기");
	}

	public void turnOff() {
		System.out.println("시동 끄기");
	}
	
	public void washCar() {} // heap method
	// 하위에서 구현하면 추가됨

	final public void run() {
		// final: 재정의 할 수 없는 매서드
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
