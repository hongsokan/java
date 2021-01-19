package ch07.ex;

/*
 * 추상 클래스
 * 	추상메서드를 가질 수 있늘 클래스. abstract로 구현
 * 	객체화 불가 => 객체화는 반드시 상속을 통해서 자손클래스의 객체화로 객체화 가능
 * 	이때 자손클래스에서는 추상메서드를 반드시 오버라이딩 해야함.
 * 	그외는 일반클래스와 동일. (생성자, 멤버변수, 멤버메서드 ...)
 * 	업무의 표준화 시 사용함
 * 
 * 추상메서드 
 * 	선언부만 존재하는 메서드, 구현부 없음. 
 * 	자손클래스에서 반드시 오버라이딩 해야함.
 * 
 * 추상클래스 간에도 상속은 가능
 */

// 추상클래스 Shape
abstract class Shape {
	String type;
	
	Shape(String type) {
		this.type = type;
	}
	
	// 추상적으로 선언해두고 상속 받는 자손클래스에서 오버라이딩하도록 함
	abstract double area(); // 추상메서드
	abstract double length(); // 추상메서드
}

class Circle extends Shape {
	int r;
	
	Circle(int r) {
		super("원"); // Shape클래스의 type="원"
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", type=" + type + "]" +
				", 넓이:" + area() + ", 둘레:" + length();
	}
	
	@Override
	double area() {
		return Math.PI * r * r;
	}
	
	@Override
	double length() {
		return Math.PI * r * 2;
	}
}


class Rectangle extends Shape {
	int width, height;
	
	Rectangle(int width, int height) {
		super("사각형"); // Shape클래스의 type="사각형"
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle" + 
				" [width=" + width + ", height=" + height + 
				", type=" + type + "]" +
				", 넓이:" + area() + ", 둘레:" + length();
	}
	
	@Override
	double area() {
		return width * height;
	}
	
	@Override
	double length() {
		return 2 * (width + height);
	}
}

public class ShapeEx01 {
	public static void main(String[] args) {
		// 추상클래스 Shape 자체는 new 연산자와 쓸 수 없지만
		// 여기선 추상클래스를 담는 배열임을 구분할 것
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		for (Shape s : shapes) {
			System.out.println(s);
		}
		// shapes[0].area();
		// shapes[1].area();
		// System.out.println(shapes[0]);
	}

}
