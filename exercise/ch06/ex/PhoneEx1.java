package ch06.ex;

/*
 * 추상화 : 클래스 생성 과정.
 * 클래스 : 사용자 정의 자료형.
 * 	속성 : 멤버변수
 * 	기능: 멤버메서드
 * 	실행 class 조건
 * 	1) java source name(PhoneEx1) == class name(PhoneEx1)
 * 	2) main method가 있어야함
 */


class Phone {
	String color;
	boolean power;
	String no;
	
	void power() {
		power = !power;
	}
	
	void send(String no) {
		System.out.println(no + "로 전화 송신 중");
	}
	
	void receive(String no) {
		System.out.println(no + "로 전화 수신 중");
	}
}


public class PhoneEx1 {

	public static void main(String[] args) {
		
		// Phone p1; => 참조변수 선언
		// new Phone() => 객체 생성. 객체화, 인스턴스화
		// new 예약어 : 객체 생성 가능. 메모리 할당함.
		// String을 제외한 모든 클래스의 객체 생성은 new 연산자로 가능함
		Phone p1 = new Phone(); // 100 (메모리 주소)
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01011112222");
		p1.receive("01033334444");
		Phone p2 = new Phone(); // 200
		/*
		 * new 예약어 기능
		 * 	1. 힙 영역에 메모리 할당
		 * 	2. 멤버변수를 기본값으로 초기화, 기본값 : 숫자 : 0, boolean : false, 그외 : null
		 * 	3. 생성자 호출 기능
		 */
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2 = p1;
		/*
		 * p1 객체와 p2 객체는 같은 객체.
		 * 하나의 객체는 두 개의 참조변수가 참조 가능. 하나의 참조변수가 두개의 객체는 참조 불가.
		 */
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}

}
