package ch06.ex;

/*
 * 생성자? 객체화시 호출되는 메서드. 생성자 없이 객체 생성 불가. 인스턴스 변수의 초기화 담당(new)
 * 
 * 생성자 구현: 1. 생성자 이름은 클래스명과 같음  2. 리턴타입 기술하지 않음
 * 
 * 기본 생성자: 클래스에 생성자를 하나도 구현하지 않으면 컴파일러가 추가해주는 생성자. public 클래스명() {}
 */

class Number1 {
	int num;
	
	// default 생성자(기본 생성자) 별도 존재
}

class Number2 {
	int num;
	
	Number2() {}	// 기본 생성자
	
	Number2(int x) { // 생성자
		num = x;
	}
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		n1.num = 10;
		Number2 n2 = new Number2();
		Number2 n3 = new Number2(20);
		System.out.println("Number1 클래스의 num =" + n1.num);
		System.out.println("Number2 클래스의 num =" + n2.num);
	}

}
