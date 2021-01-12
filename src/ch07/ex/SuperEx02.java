package ch07.ex;

// super() 생성자: 부모클래스의 생성자 호출시 사용함

class Super {
	int x;
	Super(int x) {
		this.x = x;
	}
}

class Child extends Super {
	int y;
	public Child() {
		super(10);
	}
}

public class SuperEx02 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}
}
