package ch05.ex;

/*
 * 1~9 까지 중복되지 않는 3자리 숫자를 임의로 생성
 */
public class Exam03 {

	public static void main(String[] args) {
		
		int[] arr = new int[9];
		int[] lotto = new int[3];
		
		System.out.print("arr: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]);
		}
		System.out.println();
		
		// arr 섞기
		for (int i = 0; i < 1000; i++) {
			int f = (int) (Math.random() * 9); // 0~9
			int t = (int) (Math.random() * 9); // temp
			
			// swap
			int tmp = arr[f];
			arr[f] = arr[t];
			arr[t] = tmp;
		}
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = arr[i];
		}
		
		// 선택 번호 출력
		for (int b : lotto) {
			System.out.print(b + ",");
		} 

	}

}
