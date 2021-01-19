package ch07.ex;

class Parent3 {
	int x = 10;
	void method() {
		System.out.println("Parent메서드");
	}
}

class Child3 extends Parent3 {
	int x = 20;
	void method() {
		int x = 30;
		super.method();
		System.out.println("Child메서드");
		System.out.println("x="+x); //local변수
		System.out.println("this.x="+this.x); //Child3 class영역의 instance변수
		System.out.println("super.x="+super.x); //Parent3 class영역 instance변수
	}
}

public class BindingEx01 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		System.out.println(p.x);
		p.method(); // Parent3 타입이지만 Child3의 method() 실행
		System.out.println("================");
		Child3 c = new Child3();
		System.out.println(c.x);
		c.method();
	}
}
