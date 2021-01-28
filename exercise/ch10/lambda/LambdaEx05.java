package ch10.lambda;

// 람다식의 객체는 내부객체로 표현된다
// local 변수를 inner class 내에서 사용할 때는 final 변수여야 한다.

interface LambdaInterface5 {
	void method();
}

class Outer {
	public int iv = 10;
	
	void method() {
		int iv = 40; // 로컬 변수이기 때문에 람다식 내부클래스에서 값을 바꿀 수 없음.
		LambdaInterface5 f5 = () -> {
			//iv = 50; // 상수화 필요
			System.out.println("Outer.this.iv = " + Outer.this.iv);
			System.out.println("this.iv = " + this.iv);
			System.out.println("iv = " + iv); // // Outer 클래스의 iv 멤버
		};
		
		// 람다식을 통해 method 재정의
		// 실제 실행까지 해줘야 한다
		f5.method();
	}
}

public class LambdaEx05 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}

}
