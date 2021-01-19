package ch07.ex;

// instanceof 예제

class Parent4 {
	int x = 10;
}

class Child4 extends Parent4 {
	int x = 20;
	void method() {
		System.out.println("child method");
	}
}

public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent4 p = new Parent4();
		
		// p의 주소로 가면 Child4 클래스가 있는지 여부
		if (p instanceof Child4) {	// false
			System.out.println("p 참조변수 객체는 Child3 객체");
			Child4 c = (Child4)p;
			System.out.println(c.x);
			c.method();
		}
		
		if (p instanceof Parent4) { // true
			System.out.println("p 참조변수 객체는 Parent3 객체");
		}
		
		/*
		 * 모든 클래스는 Object 클래스 상속 받음
		 * => 모든 객체는 Object 객체 포함
		 * => 모든 객체는 Object 타입의 참조변수로 참조 가능
		 */
		if (p instanceof Object) { // true
			System.out.println("p 참조변수 객체는 Object 객체");
			Object o = p; // Object에 있는 것만 볼 수 있다.
			System.out.println(p.x);
//			System.out.println(o.x); // x는 Object 클래스의 멤버가 아니다.
		}
	}
}
