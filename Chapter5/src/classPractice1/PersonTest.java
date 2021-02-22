package classPractice1;

public class PersonTest {

	public static void main(String[] args) {

		Person personJames = new Person();

		personJames.age = 40;
		personJames.name = "James";
		personJames.isMarried = true;
		personJames.numberOfChild = 3;

		personJames.showPersonInfo();

	}

}
