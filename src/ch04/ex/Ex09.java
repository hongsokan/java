package ch04.ex;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 높이 입력");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int len = input;
		
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Ex10
		len = input;
		for (int i = len; i > 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
