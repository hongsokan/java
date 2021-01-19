package ch05.ex;

import java.util.Scanner;

// 약수 출력

public class Exam07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// int num = Integer.parseInt(String)
		// int num = Integer.parseInt(args[0])
		int num = scan.nextInt();

		System.out.print("약수: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
