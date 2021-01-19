package ch03.ex1;

import java.util.Scanner;

/*
 * 사과를 살자에 담는다. 1개의 상자에 10개의 사과
 * 필요한 상자의 갯수 출력
 */

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("사과 갯수 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("필요한 상자 개수: "+((num%10>0) ? (num/10)+1 : num/10));
	}

}
