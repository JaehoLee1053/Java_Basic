package practiceClass;

public class OrderInfo {

	String orderNumber;
	String orderID;
	String orderDate;
	String ordererName;
	String productNumber;
	String destinationAddress;

	public void printInfo() {
		System.out.println("주문 번호 : " + orderID);
		System.out.println("주문자 아이디 : " + orderDate);
		System.out.println("주문 날짜 : " + ordererName);
		System.out.println("주문 상품 번호 : " + productNumber);
		System.out.println("배송 주소 : " + destinationAddress);
	}

}
