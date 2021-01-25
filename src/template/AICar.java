package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행");
		System.out.println("자율 방향 전환");
	}

	@Override
	public void stop() {
		System.out.println("자율 제동");
	}

}
