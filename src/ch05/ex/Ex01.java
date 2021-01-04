package ch05.ex;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int arr2[]; // 1. 배열 참조 변수 선언
		
		// 2. 배열 객체 생성
		arr1 = new int[5];
		arr2 = new int[5]; // int형 저장공간을 5개 생성. 기본값(0)으로 초기화
		
		// 3. 배열값을 초기화
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr2 = arr1;
		arr2[4] = 50;
		
		// 4. 배열 출력
		System.out.println("arr1 배열: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}
		System.out.println();
		
		System.out.println("arr2 배열:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		System.out.println();
		
		System.out.println("개선된 for 구문을 이용한 arr1 출력");
		// 개선된 for 구문
		for (int a : arr1) { System.out.println(a); }
		
	}

}
