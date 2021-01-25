package lambda;

public class testStringConcat {
	public static void main(String[] args) {
		StringCoImpl impl = new StringCoImpl();
		impl.makeString("Hello", "World");

		StringConcat concat = (s, v) -> System.out.println(s + "," + v);
		concat.makeString("Hello", "World");

		StringConcat concat2 = new StringConcat() {
			// 익명 내부 클래스가 람다식에서 활용됨
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		concat2.makeString("Hello", "World");
	}
}
