package ch04.ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한개의 문자 입력");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			char ch = scan.next().charAt(0);
			
			if (ch == '!') { break; }
			else if (ch >= 'A' && ch <= 'Z') { System.out.println("대문자"); }
			else if (ch >= 'a' && ch <= 'z') { System.out.println("소문자"); }
			else if (ch >= '0' && ch <= '9') { System.out.println("숫자"); }
			else { System.out.println("기타문자"); }
			
			System.out.println("ASCII: " + (int)ch + "\n");
		}
	}
}
