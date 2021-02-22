package classPractice1;

public class Order {

	Long orderNumber;
	String userId;
	String orderDate;
	String userName;
	String productNumber;
	String address;

	public void showOrderInfo() {
		System.out.println("주문번호 : " + orderNumber);
		System.out.println("주문자 아이디 : " + userId);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + userName);
		System.out.println("주문 상품 번호 : " + productNumber);
		System.out.println("배송 주소 : " + address);
	}

}
