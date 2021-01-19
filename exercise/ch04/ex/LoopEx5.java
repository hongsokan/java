package ch04.ex;

public class LoopEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {
			System.out.println("\n" + i + "단");
			for(int j=2; j<=9; j++) {
				
				if (j==5) continue; // 반복문의 처음으로 제어 이동
				if (j==5) break; // 반복문이나 switch 구문을 빠져나옴
				
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}

}
