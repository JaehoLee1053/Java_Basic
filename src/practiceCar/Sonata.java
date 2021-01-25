package practiceCar;

public class Sonata extends Car {

	@Override
	protected void start() {
		System.out.println("Sonata start");
	}

	@Override
	protected void drive() {
		System.out.println("Sonata drive");
	}

	@Override
	protected void stop() {
		System.out.println("Sonata stop");
	}

	@Override
	protected void turnoff() {
		System.out.println("Sonata turnoff");
	}

}
