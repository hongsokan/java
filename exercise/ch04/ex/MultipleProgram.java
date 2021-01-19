package ch04.ex;

import java.util.Scanner;

public class MultipleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 출력 프로그램");
		System.out.println("숫자를 입력하세요. (1~9, 0 종료)");
		
		while(true) {
			int num = scan.nextInt();
			if (num == 0) break;
			
			else if (num >= 1 && num <= 9) { 
				for (int i = 2; i <= 9; i++)
				System.out.println(num + "*" + i + "=" + num * i); 
			}
			
			else { System.out.println("숫자를 다시 입력해주세요"); }
		}
	}

}
