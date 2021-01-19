package ch05.ex;

import java.util.Scanner;

/*
 * 배열의 크기를 홀수로 입력
 * 
 * 입력:
 * 3
 * 
 * 출력:
 * 7 6 5
 *   4
 * 3 2 1
 */

public class Exam13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 배열 크기를 입력하세요");
		int num = scan.nextInt();

		
		// ex) 9
		// matrix[9][9]
		int[][] matrix = new int[num][num];
		int sum = 0;
		
		// i = 1,3,5,7,9
		for (int i = 1; i <= num; i += 2) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println(sum);
		int result = sum * 2 - 1; // 마지막 숫자 계산
		System.out.println(result);
		
		// matrix 출력
		for (int i = 0; i <= matrix.length / 2; i++) {
			for (int j = i; j < matrix.length - i; j++) {
				matrix[i][j] = result--;
//				result--;
			}
		}
		
		for (int i = matrix.length / 2 + 1; i < matrix.length; i++) {
			for (int j = matrix.length - i - 1; j <= i; j++) {
				matrix[i][j] = result--;
				result--;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					System.out.print("    " + "\t");
				}
				else {
					System.out.print(matrix[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		
		/*
		int[][] arr = new int[num][num];
		int count = 1;
		
		// 기본 배열 확인
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 배열에 필요한 값 넣기
		for (int i = (num - 1); i >= 0; i--) {
			
			if (i >= (num / 2)) {
				for (int j = i; j >= (num - i - 1); j--) {
					arr[i][j] = count++;
					System.out.println("arr[" + i + "][" + j + "]=" + count);
				}
			} 
			
			else {
				for (int j = (num - i - 1); j >= i; j--) {
					arr[i][j] = count++;
					System.out.println("arr[" + i + "][" + j + "]" + count);
				}
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
		*/
		
		
	}
}
