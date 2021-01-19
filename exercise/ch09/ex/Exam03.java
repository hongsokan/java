package ch09.ex;
// 에러 처리 2가지 방법

class MyException1 extends Exception {
	MyException1(String msg) {
		super(msg);
	}
}

public class Exam03 {
	public static void main(String[] args) {
		try {
			method();
		} catch (MyException1 e) {
			System.out.println("======error======");
		}
	}
	
	private static void method() throws MyException1 {
		throw new MyException1("Exam3.method() 예외 강제 발생");
	}

}
