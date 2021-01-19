package ch06.ex;

/*
 * 원(Circle) 클래스 구현
 * 	멤버변수: 반지름 r, x, y, 원의번호 no, 원의번호 생성 변수 static count
 * 	생성자: new Circle(r,x,y); new Circle(x,y); new Circle(r);
 * 	멤버메서드
 * 		1. double area()			- Math.PI*r*r / %.3f
 * 		2. double length()			- Math.PI*2*r
 * 		3. void move(int a, int b)	- x+a, y+b
 * 		4. void scale(double m)		- r=r*m
 * 		5. String toString() : "1번원 - 반지름:
 */

class Circle {
	double r;
	int x;
	int y;
	int no;
	static int count;
	
	Circle(double r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		no = ++count;
	}
	
	Circle(int x, int y) {
		this(1,x,y);
//		this.r = 1;
//		this.x = x;
//		this.y = y;
//		no = ++count;
	}
	
	Circle(double r) {
		this(r,0,0);
//		this.r = r;
//		this.x = 0;
//		this.y = 0;
//		no = ++count;
	}
	
	double area() {
		return Math.PI * (r * r);
	}
	
	double length() {
		return 2* Math.PI * r;
	}
	
	void move(int a, int b) {
		x += a;
		y += b;
//		this.x = x + a;
//		this.y = y = b;
	}
	
	void scale(double m) {
		r = r * m;
//		this.r = r * m;
	}
	
	public String toString() {
//		return no + "번원 - " + 
//				"반지름:" + r + ", " + 
//				"좌표:(" + x + "," + y + "), " + 
//				"넓이:" + (String.format("%f", area())) + ", " + 
//				"둘레:" + (String.format("%f", length()))
//				;
//		
		return String.format("%d번원=> 반지름:%.0f, 좌표(%d, %d), 넓이:%.3f, 둘레:%.3f", no,r,x,y,area(),length());
	}
}

public class Exam07 {

	public static void main(String[] args) {
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(10,10,10);
		carr[1] = new Circle(20,20);
		carr[2] = new Circle(100);
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10, 10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}

}
