package ch03.ex1;

import java.util.Scanner;

/*
 * 삼항 연산자 이용
 * 점수 입력 받아서 
 * 90이상이면 "A", 80이상이면 "B", 70이상이면 "C", 60이상 "D", 그외 "F"
 */

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수 입력");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println("학점: "+((score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F"));
	}

}
