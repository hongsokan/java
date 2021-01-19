package ch04.ex;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				sum += j;
				System.out.print(j + ((i != j) ? "+" : ""));
			}
			System.out.print(")" + ((i == 10) ? "=" : "+"));
		}
		System.out.println(sum);
		
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if (j != i) {
					System.out.print("+");
				}
				sum += j;
			}
			if (i == 10) {
				System.out.print(")");
			} else {
				System.out.print(")+");
			}
		}
		System.out.print("=" + sum);
		*/
	}

}
