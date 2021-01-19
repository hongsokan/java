package ch03.ex1;

import java.util.Scanner;

// 삼항 연산자
// (조건문) ? true : false

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println((num>0) ? "양수" : (num<0) ? "음수" : "0");
	}

}
