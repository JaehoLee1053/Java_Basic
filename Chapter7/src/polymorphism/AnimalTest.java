package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {

		System.out.println("동물이 움직입니다.");

	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void flying() {
		System.out.println("도수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}

}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		if(hAnimal instanceof Eagle) {
			Eagle human = (Eagle)hAnimal;
		}

//		AnimalTest test = new AnimalTest();
//
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);

		for (Animal animal : animalList) {
			animal.move();
		}
		
		

	}
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i< list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.read();
			}else if(animal instanceof Eagle) {
				Eagle eagle= (Eagle)animal;
				eagle.flying();
			}
		}
	}

	public void moveAnimal(Animal animal) {

		animal.move();

	}

}
