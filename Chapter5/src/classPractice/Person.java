package classPractice;

public class Person {

	String name;
	int money;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		showBuyInfo("별", money, "아메리카노");
		this.money -= money;
		starCoffee.money += money;
	}

	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		showBuyInfo("콩", money, "라떼");
		this.money -= money;
		beanCoffee.money += money;
	}

	public void showBuyInfo(String cafe, int money, String menu) {
		System.out.println(name + "님이 " + money + "원으로 " + cafe + " 다방 " + menu + "를 구입했습니다.");
	}

}
