package ch06.ex;

/*
 * Rectangle2 클래스 정의
 * 	멤버변수: width, height, serialNo(사각형번호), sno(번호 생성 변수)
 * 	멤버메서드 : 
 * 		int area(): 면적
 * 		int length(): 둘레
 * 		public String toString() 메서드
 * 구동클래스 구현
 * 		Rectangle2 클래스를 3개 가지고 있는 배열 생성
 * 		1번: 가로10, 세로20
 * 		2번: 가로15, 세로25
 * 		3번: 가로20, 세로30
 * 		각각 면적과 둘레 출력, 그리고 전체 면적의 합과 둘레의 합 출력
 */

class Rectangle2 {
	int width;
	int height;
	int serialNo;
	static int sno;
	
	int area() {
		return width * height;
	}
	
	int length() {
		return 2 * (width + height);
	}
	
	public String toString() {
		return serialNo + "번사각형:(" + width + "," + height + 
				")=> 면적:" + area() + ", 둘레:" + length();
	}
}

public class Exam04 {
	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[3];
		int totalArea = 0;
		int totalLength = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle2();
			arr[i].width = i * 5 + 10;
			arr[i].height = i * 5 + 20;
			arr[i].serialNo = ++Rectangle2.sno;
			System.out.println(arr[i]);
			totalArea += arr[i].area();
			totalLength += arr[i].length();
		}
		System.out.println("전체 사각형 면적 합:" + totalArea);
		System.out.println("전체 사각형 둘레 합:" + totalLength);
	}

}
