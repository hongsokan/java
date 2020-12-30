package ch02.variable;

public class CharTest {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '\u0041';
		// \t(�꺆)�� \n(�깉以�) �궫�엯
		System.out.println("臾몄옄 異쒕젰: " + c1 + '\t' + c2 + '\n');

		int i = c1 + 1;
		System.out.println(i);
		System.out.println((char) i);
		
		System.out.println("unicode: " + '\u0001');
		System.out.println("unicode: " + '\uAC00');
	}
}