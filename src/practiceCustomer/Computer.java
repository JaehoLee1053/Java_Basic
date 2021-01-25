package practiceCustomer;

public abstract class Computer {
	// new 로 생성 불가, 상속용일 때 매서드 다 구현되어도 씀
	// abstract 매서드 만드려면 클래스도 해야함
	// 하위 클래스에서 정의할 매서드를 구현할 때 씀
	public abstract void display();
	public abstract void typing();

	public void turnOn() {
		System.out.println("Turn on");
	}

	public void turnOff() {
		System.out.println("Turn off");
	}

}
