package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnale(int i) {// local inner class의 변수는 final처리 됨
		int num = 100;

		class MyRunnable implements Runnable {

			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}

		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnale(50);
		
		runnable.run();
	}
}
