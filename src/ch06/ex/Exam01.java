package ch06.ex;

/*
 * 가로, 세로 변수 가지고 있는 직사각형 클래스 만들기
 * 모든 멤버의 접근제한자는 생략
 * 모든 멤버는 인스턴스 멤버
 * 멤버 메서드로는 넓이를 print하는 area(), 둘레를 print하는 length()를 가진다.
 */

class Rectangle {
	int width;
	int height;
	
	void area() {
		System.out.println(width * height);
		return;
	}
	
	void length() {
		System.out.println(2 * (width + height));
		return;
	}
	
	public Rectangle() {
		// default 생성자
	}
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.print("넓이: ");
		r1.area();
		System.out.print("둘레: ");
		r1.length();
		
		// 가로30, 세로20 직사각형 객체 생성 및 넓이와 둘레 출력
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("넓이: ");
		r2.area();
		System.out.print("둘레: ");
		r2.length();
	}

}
