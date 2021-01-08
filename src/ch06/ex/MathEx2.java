package ch06.ex;

/*
 * 멤버 메서드의 종류 : 클래스 메서드, 인스턴스 메서드
 */

class Math2 {
	int a, b; // 인스턴스 변수
	int x;
	
	// 인스턴스 메서드: 객체화가 되어야 메서드 호출 가능. 
	// 참조변수명.메서드명() 호출해야 함
	int add1() {
		for (int i = 0; i < 5; i++) {
			int x = 7; // 지역 변수라 클래스에 있는 x와 무관
			// System.out.println(i);
		}
		System.out.println("add1 : x=" + x);
		return a + b;
	}
	
	// 클래스 메서드: 클래스 정보 로드될 때 메서드 호출이 가능.
	// 클래스명.메서드명() 호출할 수 있다.
	static int add2(int a, int b) {
		int x = 5;
		// x = 5;	// 이렇게 하는 경우 에러. new Math2() 인스턴스 생성해야 함.
		System.out.println("add2 : x=" + x);
		return a + b;
	}
}

public class MathEx2 {
	public static void main(String[] args) {
		System.out.println("main");
		Math2 m = new Math2();
		System.out.println();
		
		m.a = 10;	System.out.println(m.a);
		m.b = 20;	System.out.println(m.b);
		System.out.println();
		
		System.out.println("m.add1() = " + m.add1()); // 30
		System.out.println();
		
		System.out.println("m.add2(100, 200) = " + m.add2(100, 200)); // 300, 클래스에 저장
		System.out.println();
		
		System.out.println("Math2.add2(100, 200) = " + Math2.add2(100, 200)); // 300
		System.out.println();
	}

}
