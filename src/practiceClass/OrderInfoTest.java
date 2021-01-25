package practiceClass;

public class OrderInfoTest {

	public static void main(String[] args) {
		
		OrderInfo firstOrder = new OrderInfo();
		
		firstOrder.orderNumber = "201907210001";
		firstOrder.orderID = "abc123";
		firstOrder.orderDate = "2019년 7월 21일";
		firstOrder.ordererName = "홍길순";
		firstOrder.productNumber = "PD0345-12";
		firstOrder.destinationAddress = "서울시 영등포구 여의도동 20번지";

		firstOrder.printInfo();
		
	}
 
}
