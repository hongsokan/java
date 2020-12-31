package ch04.ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 높이 입력");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int num = input;
		
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= num; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
