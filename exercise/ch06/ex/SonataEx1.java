package ch06.ex;

/*
 * 클래스(static) 변수 : 클래스 영역에 선언. 
 * 				static 예약어로 선언함. 
 * 				클래스 정보가 메모리에 로드될 때 변수메모리 할당. 
 * 				객체화(new 연산자로 주소 생성)와 관련없는 변수. 
 * 				메모리할당 위치 : 클래스 영역. 
 * 				클래스의 모든 객체의 공통 변수로 사용됨. 
 * 				사용 : 클래스명.변수명. 
 * 인스턴스 변수 : 클래스 영역에 선언됨. 
 * 				자료저장형 변수명; 선언됨. 
 * 				객체화시 메모리 할당받음. 
 * 				반드시 객체화 되어야 변수 사용 가능. 
 * 				메모리 할당 위치 : 힙영역 
 * 				사용 : 참조변수명.변수명 
 * 지역 변수 : 메서드 내부에서 선언됨. 
 * (매개변수포함) 초기화되어야함.
 * 			변수 선언이 실행될 때 메모리 할당.
 * 			메모리할당 : 스택 영역 
 * 			사용 : 변수명 
 */


class Sonata {
	String color;	// 인스턴스 변수 
	int number;		// 인스턴스 변수 
	static int width = 250; // 클래스 변수  
	static int height = 150; // 클래스 변수 
	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class SonataEx1 {

	public static void main(String[] args) {
		System.out.println("자동차 크기: " + Sonata.width + "," + Sonata.height);
		Sonata car1 = new Sonata();
		car1.color = "white";
		car1.number = 1234;
		System.out.println("car1: " + car1); // car1.toString() 메서드 호출 
		Sonata car2 = new Sonata();
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2: " + car2);
		car2.width = 300; // 클래스 변수 
		car1.height = 200; // 클래스 변수 
		String temp = "aaa: " + car1;
		System.out.println(temp);
		System.out.println("============");
		System.out.println("car1: " + car1);
		System.out.println("car2: " + car2);
		println(car1);
	}
	
	public static void println(Object o) {
		System.out.println(o.toString());
	}

}
