package ch07.ex;

public class Exam04 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Lion();
		animal[2] = new Cat();
		for(Animal a : animal) {
			System.out.print(a.type + "=>");
			a.sound();
			a.eat();
		}
	}
}

abstract class Animal {
	String type;
	int leg;
	Animal(String type, int leg) {
		this.type = type;
		this.leg = leg;
	}
	abstract void eat();
	abstract void sound();
}

class Dog extends Animal {
	Dog() {
		super("Dog", 4);
	}
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}
	void sound() {
		System.out.println("멍멍");
	}
}

class Lion extends Animal {
	Lion() {
		super("Lion", 4);
	}
	void eat() {
		System.out.println("초식동물을 잡아먹는다");
	}
	void sound() {
		System.out.println("어흥");
	}
}

class Cat extends Animal {
	Cat() {
		super("Cat", 4);
	}
	void eat() {
		System.out.println("주인이 준 것을 먹는다");
	}
	void sound() {
		System.out.println("야옹");
	}
}