package ch04.ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 높이 입력");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int num = input;
		
		for (int i = 1; i <= num; i++) {
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
