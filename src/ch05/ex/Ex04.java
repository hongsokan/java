package ch05.ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("10진수 -> 2진수 변환 (10진수 입력)");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		while (divnum != 0) {
			binary[index++] = divnum % 2;
			divnum /= 2;
		}
		
		// System.out.println(index);
		System.out.print(num + "의 2진수 : ");
		
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

}
