package ch04.ex;

import java.util.Scanner;


// 자연수 각 자리수의 합 구하기
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int i = 0;
		int sum = 0;
		while (num > 0) {
			i = num % 10; System.out.println("i = "+ i);
			sum += i; System.out.println("sum = " + sum);
			num /= 10; System.out.println("num = " + num);
		}
		System.out.println(sum);
		sum = 0;
		
		/* for문
		for ( ; num != 0 ; num /= 10) {
			sum += num % 10;
		}
		System.out.println(sum);
		*/
	}

}
