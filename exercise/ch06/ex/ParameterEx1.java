package ch06.ex;

/*
 * 매개변수 예제 (기본형, 참조형)
 */

class Value { int val; }

public class ParameterEx1 {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val); // val값은 전달했지만, 원본이 바뀌진 않는다. read-only
		System.out.println("2:change1() 이후 :" + v.val);
		change2(v);		// 참조형 변수, read&write
		System.out.println("4:change2() 이후 :" + v.val);
	}
	
	static void change1(int val) {	// val = 100, 값 전달만
		val += 100;	// val = 200, 그러나 원본이 바뀌진 않는다
		System.out.println("1:change1() :" + val);
	}
	
	static void change2(Value v) {	// 원본 주소 전달
		v.val += 100;	// 원본 값까지 바뀐다
		System.out.println("3:change2() :" + v.val);
	}

}
