package ch06.ex;

/*
 * Rectangle3 구현
 * 	멤버변수: width, height, serialNo, sno(번호 생성 위한 static 변수)
 * 	생성자: 가로와 세로 입력 받고, 가로와 세로 값 초기화
 * 	멤버메서드:
 * 		int area()
 * 		int length()
 * 		boolean isSquare()
 * 		void info() :
 * 			"i번사각형 : (width, height) 
 * 			넓이: area(), 둘레 : length(), 정사각형"
 */

class Rectangle3 {
	int width;
	int height;
	int serialNo;
	static int sno;
	
	Rectangle3(int width, int height) {
		this.width = width;
		this.height = height;
		serialNo = ++sno;
	}
	
	int area() {
		return this.width * this.height;
	}
	
	int length() {
		return 2 * (this.width + this.height);
	}
	
	boolean isSquare() {
		if (this.width == this.height) {
			return true;
		} else {
			return false;
		}
	}
	
	void info() {
		System.out.println(
				serialNo + "번사각형:(" + this.width + "," +
						this.height + ") " + "넓이:" + area() + ", 둘레:" +
						length() + ", " + (isSquare() ? "정사각형" : "직사각형")
				);
	}
}

public class Exam06 {

	public static void main(String[] args) {
		Rectangle3[] recarr = new Rectangle3[3];
		recarr[0] = new Rectangle3(10, 10);
		recarr[1] = new Rectangle3(20, 10);
		recarr[2] = new Rectangle3(25, 25);
		for (Rectangle3 r : recarr) {
			r.info();
		}
	}

}
