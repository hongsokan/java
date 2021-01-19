package ch05.ex;

import java.util.Scanner;

// 2 수의 공약수
public class Exam08 {

	public static void main(String[] args) {
		
		/*
		// command line
		System.out.println("2 개의 숫자를 입력하세요.");
		if (args.length != 2) {
			System.out.println("command line: 2개의 파라미터 입력");
			System.out.println("java Exam08 12 15");
			return; // main 종료
		}
		
		// int num = Integer.parseInt(String)
		// int num = Integer.parseInt(args[0])
		 */
		
		// scanner
		System.out.println("2 개의 숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int min = (num1 > num2) ? num2 : num1; // 작은 수 것만 찾으면 된다
		
		// 2 숫자의 공약수 출력
		System.out.print("약수: ");
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
