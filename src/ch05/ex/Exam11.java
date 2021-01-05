package ch05.ex;

// 2차원 배열의 행의 합, 열의 합 구하기

public class Exam11 {

	public static void main(String[] args) {
		int arr[][] = {
				{1}, 
				{10,20}, 
				{30,40,50}, 
				{60,70,80,90}, 
				{60,70,80,90,100}
				};
		int row[] = new int[5];
		int col[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// System.out.print(arr[i][j] + " ");
				row[i] += arr[i][j];
				col[j] += arr[i][j];
			}
			System.out.println(i + " 행의 합 : "+ row[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < col.length; i++) {
			System.out.println(i + " 열의 합 : " + col[i]);
			
		}
	}

}
