package ch12.ex;
// Character 클래스
public class WrapperEx04 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '4', '&'};
		for (char c : data) {
			if (Character.isUpperCase(c)) System.out.println(c + ": 대문자");
			else if (Character.isLowerCase(c)) System.out.println(c + ": 소문자");
			else if (Character.isDigit(c)) System.out.println(c + ": 숫자");
			else System.out.println(c + ": 일반문자");
		}
		System.out.println();
		
		Character ch = 'A';		// boxing
		System.out.println(ch.equals('A'));		// true
		System.out.println(ch == 'A');			// true
		System.out.println();
		
		System.out.println(Character.isAlphabetic('A')); // true
		System.out.println(Character.isAlphabetic('a')); // true
		System.out.println(Character.isAlphabetic('가')); // true
		System.out.println(Character.isAlphabetic('1')); // false
	}

}
