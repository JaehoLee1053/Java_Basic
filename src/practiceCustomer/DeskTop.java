package practiceCustomer;

public class DeskTop extends Computer {
	// abstract 상속 받으려면 abstract로 받아야함
	// abstract 매서드 다 구현하면 안 해도 됨
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void turnOff() {
		System.out.println("DeskTop TurnOff");
	}

	public void typing() {
		System.out.println("Desktop typing");
	}

}
