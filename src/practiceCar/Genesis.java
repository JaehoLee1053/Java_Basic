package practiceCar;

public class Genesis extends Car {

	@Override
	protected void start() {
		System.out.println("Genesis start");
	}

	@Override
	protected void drive() {
		System.out.println("Genesis drive");
	}

	@Override
	protected void stop() {
		System.out.println("Genesis stop");
	}

	@Override
	protected void turnoff() {
		System.out.println("Genesis turnoff");
	}

}
