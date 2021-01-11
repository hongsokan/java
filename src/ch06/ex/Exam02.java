package ch06.ex;

/*
 * Rectangle 객체를 3개 저장할 배열 생성
 * 0번지: 가로10, 세로20
 * 1번지: 가로11, 세로21
 * 2번지: 가로12, 세로22
 * 각각 넓이와 둘레까지 출력
 */

public class Exam02 {

	public static void main(String[] args) {
		// Rectangle객체를 3개 저장할 배열
		// Rectangle객체를 참조할 참조변수의 배열
		Rectangle[] rarr = new Rectangle[3];
		for (int i = 0; i < rarr.length; i++) {
			rarr[i] = new Rectangle(); // Rectangle객체화
			rarr[i].width = 10 + i;
			rarr[i].height = 20 + i;
			System.out.print(i + "번 사각형 넚이: ");
			rarr[i].area();
			System.out.print(i + "번 사각형 둘레: ");
			rarr[i].length();
		}
	}

}
