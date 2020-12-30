package ch04.ex;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int cnt = 0;
		System.out.println("숫자 입력 (종료: 99999)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			int num = scan.nextInt();
			if(num==99999) break;
			cnt++;
			sum += num;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum/cnt);
	}

}
