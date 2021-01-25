package inheritance;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;

	public VIPCustomer(int customerID, String customerName) {
		// super(); // 자동 생성
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer() 호출");
	}

	@Override // Annotation 컴파일러에게 정보제공
	public int calcPrice(int price) {
		// Override : 같은 이름, 같은 인자의 함수 내용을 상위 클래스에서 재정의
		bonusPoint += price * bonusRatio;
		return price = (int) (price * salesRatio);
	}

}
