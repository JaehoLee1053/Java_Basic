package classPractice1;

public class OrderTest {

	public static void main(String[] args) {
		
		Order orderFirst = new Order();
		
		orderFirst.orderNumber = 201907210001L;
		orderFirst.userId = "abc123";
		orderFirst.orderDate = "2019년 7월 21일";
		orderFirst.userName = "홍길순";
		orderFirst.productNumber = "PD0345-12";
		orderFirst.address = "서울시 영등포구 여의도동 20번지";
		
		orderFirst.showOrderInfo();

	}

}
