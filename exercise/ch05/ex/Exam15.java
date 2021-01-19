package ch05.ex;

/*
 * 2차원 배열보다 가로,세로가 1씩 더 큰 배열 result를 생성하여, 마지막 행과 열에 합계 저장
 */
public class Exam15 {

	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; // score[i][j]
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length; i++) { // 5
			for(int j=0; j<score[i].length; j++) { // 3
				result[i][j] = score[i][j];
				
				result[i][score[i].length] += score[i][j]; // 행 뒤에 추가
				result[score.length][j] += score[i][j]; // 열 뒤에 추가
				result[score.length][score[i].length] += score[i][j]; // 행과 열 뒤(총합)
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}

	}

}
