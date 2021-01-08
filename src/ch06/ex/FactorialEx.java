package ch06.ex;

/*
 * call stack 영역
 * 재귀 메서드(함수): 자신이 자신메서드를 다시 호출하는 메서드
 * 		=> 스택 영역이 존재하므로 가능함
 */

public class FactorialEx {

	public static void main(String[] args) {
		System.out.println("4! = " + factorial(4));
		// 4*3*2*1
	}
	
	public static int factorial(int i) {
		System.out.println(" i" + i);
		return (i == 1) ? 1 : i*factorial(i-1);
	}

}
