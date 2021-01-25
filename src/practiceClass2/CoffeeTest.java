package practiceClass2;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("Kim", 10000);
		Person lee = new Person("Lee", 7000);
		
		Cafe cafe = new Cafe();
		
		cafe.buy(kim, "아메리카노");
		cafe.buy(lee, "라떼");

	}

}
