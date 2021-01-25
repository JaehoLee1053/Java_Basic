package practiceCar;

public class Grandeur extends Car {

	@Override
	protected void start() {
		System.out.println("Grandeur start");
	}

	@Override
	protected void drive() {
		System.out.println("Grandeur drive");
	}

	@Override
	protected void stop() {
		System.out.println("Grandeur stop");
	}

	@Override
	protected void turnoff() {
		System.out.println("Grandeur turnoff");
	}

}
