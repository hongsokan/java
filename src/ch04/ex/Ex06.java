package ch04.ex;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수 입력");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int i = 0;
		int sum = 0;
		
		do {
			sum += (int)(str.charAt(i)) - 48;	// System.out.println("sum=" + sum);
			i += 1;	// System.out.println("i=" + i);
		} while (i < str.length());

			
		System.out.println(sum);
	}

}
