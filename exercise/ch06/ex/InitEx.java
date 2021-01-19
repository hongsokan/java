package ch06.ex;

/*
 * 초기화 블럭 예제
 * static 초기화 블럭
 * 		주요기능: 클래스 변수의 초기화
 * 		실행시기: 클래스 정보가 로드 되고, 한번 실행
 * 인스턴스 초기화 블럭
 * 		주요기능: 인스턴스 변수의 초기화, 생성자와 기능이 겹침
 * 		실행시기: 객체 생성 시 생성자 호출 전 먼저 호출
 * 
 * class와 call -> static 변수 -> static block --> static method
 * 객체화 --> instance 변수 --> instance block ---> 생성자
 */

public class InitEx {

	static int cv; // 클래스 변수
	int iv; // 인스턴스 변수

	static {	// 한번만 실행
		cv = (int) (Math.random() * 100);
		System.out.println("1. 클래스 초기화 블럭 cv=" + cv);
		//iv = (int)(Math.random() * 100); //error
	}
	
	{
		iv = (int) (Math.random() * 100);
		System.out.println("4. 인스턴스 초기화 블럭. 생성자보다 먼저 호출됨. " + iv);
	}
	
	InitEx() {
		System.out.println("5. 생성자 호출됨");
	}

	public static void name() {}
	
	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작.");
		
		System.out.println("3. main init1 객체 생성");
		InitEx init1 = new InitEx();
		name();
		
		System.out.println("main init2 객체 생성");
		InitEx init2 = new InitEx();
	}
}
