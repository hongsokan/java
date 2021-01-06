package ch05.ex;

import java.util.Scanner;

public class Exam17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 row 수를 입력하세요.");
		int row = scan.nextInt();
		System.out.println("배열의 column 수를 입력하세요.");
		int col = scan.nextInt();
		int[][] arr = new int[row][col];
		int count = 1;

		// 배열에 필요한 값 넣기
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = count++;
			}
		}

		// 결과 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0)
					System.out.print("\t");
				else
					System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
