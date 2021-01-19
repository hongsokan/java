package ch04.ex;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 높이 입력");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		/*
		 * ex) len = 5
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * bottom = 9 ; m = 4 ;
		 * i = 0~4 ; j = 0~4 ;
		 * m을 중심으로 양쪽으로 '*'을 하나씩 추가 (j >= m - i && j <= m + i)
		 */
		
		int bottom = len * 2 - 1;
		int m = bottom / 2;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < bottom; j++) {
				if (j >= m - i && j <= m + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
