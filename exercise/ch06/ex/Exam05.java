package ch06.ex;

/*
 * Animal 클래스
 * 결과 - 원숭이:26
 * 인스턴스 변수 - name, age
 */

class Animal {
	String name;
	int age;
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + ":" + this.age;
	}
}

public class Exam05 {

	public static void main(String[] args) {
		Animal a = new Animal("원숭이", 26);
		System.out.println(a);
	}

}
