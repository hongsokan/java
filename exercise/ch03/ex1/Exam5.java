package ch03.ex1;
import java.util.Scanner;

/*
 * 한 개의 문자 입력 받아서 소문자인 경우 대문자로 변경하여 출력
 * 소문자 아닌 경우 "소문자아님" 출력
 * 대문자 = 소문자 - 32
 */

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한개의 문자를 입력");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		String result = (ch>='a' && ch<='z') ? (char)(ch-32)+"" : "소문자아님";
		System.out.println(result);
		System.out.println((ch>='a' && ch<='z') ? (char)(ch-32) : "소문자아님");
	}

}
