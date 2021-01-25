package practiceCar;

public abstract class Car {

	protected abstract void start();
	protected abstract void drive();
	protected abstract void stop();
	protected abstract void turnoff();

	final public void run() {
		start();
		drive();
		stop();
		turnoff();
	}

}
