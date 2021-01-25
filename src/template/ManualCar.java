package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("수동 운전");
		System.out.println("수동 조작");
	}

	@Override
	public void stop() {
		System.out.println("수동 제동");
	}

}
