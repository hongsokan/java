package ch07.ex;

/*
 * SutdaCard 20장으로 이루어진 SutdaDeck 클래스 구현
 * 
 * SutdaCard 클래스
 * 	1. 멤버변수: int number, boolean isKwang
 * 	2. 생성자: this 생성자 이용
 * 		- () : number=1, isKwang=true인 객체 생성
 * 		- (int, boolean) : 멤버변수에 값 저장
 * 	3. 메서드
 * 		void info : number+isKwang ? "K" : "" 정보 출력
 * 
 * SutdaDeck 클래스
 * 1. 멤버변수
 * 	SutdaCard 20장을 저장할 배열.
 * 2. 생성자
 * 	SutdaCard 20장을 생성하여 배열에 저장.
 * 3. 메서드
 * 	(1) void shuffle(): 카드 섞기
 * 	(2) SutdaCard pick(int index): index에 해당하는 카드 한장 반환
 * 	(3) SutdaCard pick(): 임의의 카드 한장 반환
 */

class SutdaCard {
	int number;
	boolean isKwang;
	
	SutdaCard() {
		this.number = 1;
		this.isKwang = true;
	}
	
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	
	void info() {
		System.out.println(this);
	}
	
	public String toString() {
		return number + ((isKwang) ? "K" : "");
	}
}

class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new SutdaCard((i % 10) + 1,(i==0 || i==2 || i==7) ? true : false);
		}
	}
	
	void shuffle() {
		for (int i = 0; i <= 1000; i++) {
				int f = (int)(Math.random() * 20);
				int t = (int)(Math.random() * 20);
				SutdaCard tmp = cards[f];
				cards[f] = cards[t];
				cards[t] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		int i = (int)(Math.random() * 2);
		return cards[i];
	}
	

	SutdaCard pick() {
		int i = (int)(Math.random() * 20);
		return cards[i];
	}
	
	public String toString() {
		String result = "";
		for (SutdaCard c : cards) {
			result += c.toString() + ",";
		}
		return result;
	}
}

public class Exam01 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		// 1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	}
}
