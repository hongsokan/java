package ch09.ex;

/*
 * 다중 catch 구문 예제
 * top -> down 처리
 * 서로 상관없는 Exception은 상관없지만 상속 관계의 Exception은 조상이
 * 아래에 있어야함
 */

public class ExceptionEx02 {
	public static void main(String[] args) {
		try {
			// ArrayIndexOutOfBoundsException 예외 발생
			System.out.println(args[0]);	// 1) 입력 안함
			
			// NumberFormatException 예외 발생
			System.out.println(Integer.parseInt(args[0]));	// 2) a
			String str = null;
			System.out.println(str.charAt(0));	// 3) 0
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요.");
		} catch (NullPointerException e) {
			System.out.println("Null 입니다.");
		} catch (NumberFormatException e) {
			System.out.println("command 라인에 숫자로 입력하세요");
		} catch (RuntimeException e) {
			System.out.println("1. 오류발생 : 전산부로 전화요망");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("2. 오류발생 : 전산부로 전화요망");
		}

	}
}
