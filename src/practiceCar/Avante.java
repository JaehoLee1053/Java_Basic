package practiceCar;

public class Avante extends Car {

	@Override
	protected void start() {
		System.out.println("Avante start");
	}

	@Override
	protected void drive() {
		System.out.println("Avante drive");
	}

	@Override
	protected void stop() {
		System.out.println("Avante stop");
	}

	@Override
	protected void turnoff() {
		System.out.println("Avante turnoff");
	}

}
