package gamelevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Advanced run");
	}

	@Override
	public void jump() {
		System.out.println("Advanced jump");
	}

	@Override
	public void turn() {
		System.out.println("Adavanced turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("Advanced");
	}

}
