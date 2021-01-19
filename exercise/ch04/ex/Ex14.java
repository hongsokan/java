package ch04.ex;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 입력");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num = scan.nextInt();
			if (num == 0) break;
			
			int result = 0;
			int temp = num;
			
			while (temp != 0) {
				result *= 10;
				result += temp % 10;
				temp /= 10;
			}
			
			if (num == result) {
				System.out.println("좌우대칭수");
			} else {
				System.out.println("좌우대칭수 아님");
			}
		}
	}

}
