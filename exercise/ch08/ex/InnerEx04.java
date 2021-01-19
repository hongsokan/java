package ch08.ex;

// 익명 내부클래스

interface I { 
	void test();
}

abstract class Abs {
	abstract void test();
}

public class InnerEx04 {
	public static void main(String[] args) {
		int iv = 9999;
		
		I i = new I() {
			int iv = 100;

			@Override
			public void test() {
				System.out.println("iv=" + iv);
				System.out.println("this.iv=" + this.iv);
				System.out.println("I 내부클래스의 test 메서드");
			}
		};
		i.test();
		// iv 멤버는 I 인터페이스의 멤버가 아니므로 접근 불가
		// System.out.println((i.iv)); // error
		
		
		//iv++;
		// 익명 내부클래스는 지역 내부클래스임
		// 지역변수는 상수화가 필요함.
		Abs a = new Abs() {

			@Override
			void test() {
				System.out.println("iv=" + iv); // 지역변수 iv 출력
				System.out.println("Abs 내부클래스의 test 메서드");
			}
		};
		a.test();

	}

}
