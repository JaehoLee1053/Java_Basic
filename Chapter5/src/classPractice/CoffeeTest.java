package classPractice;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("Kim", 10000);
		Person lee = new Person("Lee", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, 4000);
		lee.buyBeanCoffee(beanCoffee, 4500);

	}

}
