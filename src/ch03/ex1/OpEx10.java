package ch03.ex1;

import java.util.Scanner;

public class OpEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수 입력");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(score + "점은 " + result + "입니다.");
		System.out.println(score + "점은 " + ((score%2==0)?"짝수":"홀수") + " 입니다.");
		
		// 짝수, 홀수, 0 인지 출력	-11%2 -> -1 -홀수는 0
		result = (score % 2 == 1) ? "홀수" : (score > 0) ? "짝수" : "0";
		System.out.println(score + "점은 " + result + "입니다.");
		
		// 조건문 미리보기
		String r;
		if (score >= 60) {
			r = "합격";
		} else {
			r = "불합격";
			System.out.println(r);
		}
	}

}
