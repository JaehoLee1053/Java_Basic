package practiceClass2;

public class Cafe {

	String name;
	int price;

	public void buy(Person person, String menu) {
		if (menu == "아메리카노")
			price = 4500;
		else if (menu == "라떼")
			price = 5000;
		person.money -= price;
		person.restMoney();
	}

}
