package ch03.ex1;

import java.util.Scanner;

/* 10~99 자연수 입력 받아
 * 10의 배수에 입력수를 뺀 값 출력
 * ex)
 * 입력: 24
 * 출력: 30 - 24 = 6
 */


public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10부터 99까지 두자리수 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = (num%10==0) ? num : (((num/10)+1)*10);
		System.out.println( result + "-" + num + "=" + (result-num) );
	}

}
