package ch04.ex;

public class LoopEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {
			System.out.println("\n" + i + "단");
			for(int j=2; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}

}
