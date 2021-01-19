package ch05.ex;

import java.util.Arrays;

public class Ex14 {

	public static void main(String[] args) {
		int score[] = {90, 80, 70};
		int score2[] = null;
		score2 = Arrays.copyOf(score, 5);
		
		for (int s : score2) {
			System.out.println(s);
		}
		
		System.out.println("Arrays.toString(score2)");
		System.out.println(Arrays.toString(score2));
	}

}
