package ch07.ex;
/*
 * final 변경불가
 * final 메서드: 오버라이딩(재정의) 불가 메서드
 */

public final class FinalMethod {
	final void finalMethod() {	//오버라이딩 불가 메서드
		System.out.println("finalMethod 오버라이딩 불가");
	}
}

/*
class SubMethod extends FinalMethod {
	void finalMethod() {
		System.out.println("finalMethod 오버라이딩 불가");
	}
}
*/