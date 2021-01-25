package practiceClass;

public class PersonTest {

	public static void main(String[] args) {

		Person personJames = new Person();

		personJames.age = 40;
		personJames.name = "James";
		personJames.isMarried = true;
		personJames.children = 3;

		personJames.printInfo();

	}

}
