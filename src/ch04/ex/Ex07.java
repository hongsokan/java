package ch04.ex;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int i = 1;
		// for (i=1; i<=100; i++)
		do {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.print(i + " ");
				sum += i;
			}
			i++;
		} while (i <= 100);
		System.out.println();
		System.out.println("2와 3의 배수의 합: " + sum);
		
		sum = 0;
		i = 1;
		do {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.print(i + " ");
				sum += i;
			}
			i++;
		} while (i <= 100);
		System.out.println();
		System.out.println("2와 3의 배수가 아닌 수의 합: "+ sum);
		
	}

}
