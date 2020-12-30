package ch04.ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. ");
		
		while(true) {
			int num = scan.nextInt();
			if (num == 99999) break;
			if (num == 0) { System.out.println("0"); }
			else if (num > 0 ) { System.out.println("양수"); }
			else { System.out.println("음수"); }
		}
	}

}
