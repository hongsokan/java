package ch04.ex;

import java.util.Scanner;

public class LoopEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = (int)(Math.random() * 100) + 1;
		System.out.println("숫자 맞추기 게임");
		System.out.println("정답: " + ans);
		Scanner scan = new Scanner(System.in);
		
		int input;
		int cnt = 0;
		
		do {
			System.out.println("1~100");
			input = scan.nextInt();
			if (ans > input) {
				System.out.println("더 큰 수");
			} else if (ans < input) {
				System.out.println("더 작은 수");
			} else {
				System.out.println("정답");
			}
			cnt++;
		} while(ans != input);
		System.out.println("횟수: " + cnt);
	}

}
