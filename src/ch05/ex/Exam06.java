package ch05.ex;

import java.util.Scanner;

/*
 * 10진수 -> 16진수
 * 16진수: 0~9, a~f
 * 10:A , 11:B, ...
 */
public class Exam06 {

	public static void main(String[] args) {
		System.out.println("10진수 -> 16진수");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] binary = new int[32];
		int[] hex = new int[32];
		
		// 2진수 계산
		int divnum = num, index = 0;
		
		while (divnum != 0) {
			binary[index++] = divnum % 2;
			divnum /= 2;
		}
		
		System.out.print(num + "의 2진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
		// 16진수 계산
		char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; 
		divnum = num; 
		index = 0;
		
		while (divnum != 0) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;
		}
		
		System.out.print(num + "의 16진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i] + " ");
		}
		
	}

}
