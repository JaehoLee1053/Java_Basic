package template;

// 상수 구현 방법
// 자바는 클래스 밖에 정의 못 함
public class Constant {
	public static final int MIN = 1;
}

class ConstantTest {
	public static void main(String[] args) {
		System.out.println(Constant.MIN);
		// static으로 생성해서 instance 생성 않고 클래스 이름으로 참조 가능
	}
}