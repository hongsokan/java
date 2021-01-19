package ch06.ex;

/* 오버로딩 예제
 * 		같은 클래스 내부에 같은 이름 가진 메서드가 여러개 존재할 수 있음.
 * 		단 매개변수의 갯수, 순서, 타입이 달라야 함. => 매개변수 이름이 아닌 자료형으로 판단. */

class Math3 {
	int a = 100;
	
	// int형 주석 처리할 경우 정수형 매개변수는 4번 메서드에서 처리
//	int add(int b) {	System.out.println("1:");	return a + b;	}
	double add(float b) {	System.out.println("2:");	return a + b; }
	double add(double b) {	System.out.println("3:");	return a + b; }
	double add(long b) {	System.out.println("4:");	return a + b; }
	String add(String b) {	System.out.println("5:");	return a + b; }
}

public class OverloadEx1 {

	public static void main(String[] args) {
		Math3 m = new Math3();
		System.out.println(m.add(10));
		System.out.println(m.add(10.3));
		System.out.println(m.add("번"));
	}

}
