package ch05.ex;

/*
 * Math.random()으로 배열에 임의의 수 10개 저장 및 출력
 */

public class Exam02 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
			
			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println(arr);
	}

}
