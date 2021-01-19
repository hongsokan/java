package ch06.ex;

/*
 * Card class
 * 	인스턴수 변수: kind, number
 * 	static 변수: width, height
 * 	메소드 toString(): 자동완성시 static 변수는 추가. ex) Heart:1(100,250)
 */

class Card {
	static int width = 100;
	static int height = 250;
	String kind;
	int number;
	
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class Exam03 {

	public static void main(String[] args) {
		//1. card1 객체 생성
		Card card1 = new Card();
		
		//2. card1.kind = "Heart", number=1로 초기화
		card1.kind = "Heart";
		card1.number = 1;
		
		//3. card1 출력
		System.out.println(card1);
		
		//4. card2 객체 생성
		Card card2 = new Card();
		
		//5. card2.kind = "Spade", number=1로 초기화
		card2.kind = "Spade";
		card2.number = 1;
		
		//6. card2 출력
		System.out.println(card2);
		
		//7. card의 가로와세로를 (50,80)으로 변경
		Card.width = 50;
		Card.height = 80;
		
		//8. card1 출력
		System.out.println(card1);
		
		//9. card2 출력
		System.out.println(card2);
	}

}
