package ch05.ex;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0, max = 0, min = Integer.MAX_VALUE;
		
		// int max & min
		System.out.println(Integer.MAX_VALUE + "," + Integer.MIN_VALUE);
		
		System.out.println("5명의 정수를 입력하세요");
		
		for(int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}

		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum/score.length);
		System.out.println("최대점수: " + max);
		System.out.println("최소점수: " + min);
	}

}
