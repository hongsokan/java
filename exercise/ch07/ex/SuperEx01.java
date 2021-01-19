package ch07.ex;

class Parent {
	int x = 10;
	
	Parent(int x) {
		this.x = x;
	}
	
	Parent() {
		x = 400;
	}
}

class Child2 extends Parent {
	int x = 20;
	
	// default constructor는 생략 가능
	Child2() {
		// super(); // 생략된 것
	}
	
//	Child2() {
//		super(100);
//	}
	
	void method() {
		int x = 30;
		// x - 1.지역변수=>2.현재클래스의 멤버 중 x =>부모클래스의 객체맴버 중 x
		System.out.println(x); // 30
		// 1.현재클래스의 멤버 중 x => 부모클래스의 객체의 멤버 중 x 
		System.out.println(this.x); // 20
		// 부모클래스의 객체의 멤버 중 x
		System.out.println(super.x);
	}
}

public class SuperEx01 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}
