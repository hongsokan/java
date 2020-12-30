package ch03.ex1;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("반지름 입력");
		Scanner scan = new Scanner(System.in);
		double pi = 3.141592;
		int r = scan.nextInt();
		
		System.out.println("면적 = " + pi * r * r);
		System.out.println("둘레 = " + pi * 2 * r);
	}

}
