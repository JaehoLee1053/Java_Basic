package interfaceex;

public interface Calc {

	double PI = 3.14;
	int ERROR = -9999999;

	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	default void description() {
		System.out.println("Score calculator");
		myMethod();
	}

	static int total(int[] arr) {
		int total = 0;

		for (int i : arr) {
			total += i;
		}
		myStaticMethod();
		// static method에서 일반 method는 호출 불가
		return total;
	}
	
	private void myMethod() {
		System.out.println("Private method");
	}
	
	private static void myStaticMethod() {
		System.out.println("My static method");
	}

}
