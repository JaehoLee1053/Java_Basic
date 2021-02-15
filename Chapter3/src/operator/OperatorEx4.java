package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10)
				&& ((i = i + 2) < 10); // 앞만 보고 판단 가능하면 evaluation하지 않음
		System.out.println(num1);
		System.out.println(i);

		System.out.println(value);

	}

}
