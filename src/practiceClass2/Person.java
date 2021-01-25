package practiceClass2;

public class Person {

	String name;
	int money;
	Cafe coffee;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void restMoney() {
		System.out.println(name + "의 잔금 : " + money + "원");
	}

}
