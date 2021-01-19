package ch04.ex;

public class LoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("for loop :");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("while loop :");
		int i = 1;
		while (i <= 5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		System.out.println("do-while loop : ");
		i = 1;
		do {
			System.out.print(i);
			i++; // 6
		} while (i <= 5);
		System.out.println();
	}

}
