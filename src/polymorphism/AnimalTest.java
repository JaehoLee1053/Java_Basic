package polymorphism;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물이 움직인다.");
	}

}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷는다.");
	}

	public void read() {
		System.out.println("사람이 책을 읽는다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥한다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 난다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);

		for (Animal it : animalList) {
			it.move();
		}

		Human human = (Human) hAnimal;
		human.read(); // Human에만 있는 method

		if (hAnimal instanceof Eagle) { // check
			Eagle eagle = (Eagle) hAnimal;
		}

	}

	public void testDownCasting(ArrayList<Animal> list) {
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);

			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.read();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
