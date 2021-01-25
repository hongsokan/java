package ch12.ex;

import java.util.Random;

/*
 * 난수를 생성하는 기능을 가진 클래스
 * Math 클래스의 random() 통해서 난수 생성할 때는 double만 가능
 * Random 클래스는 boolean, int, long, float, double 등 모두 가능
 * 또한, 난수 만드는 알고리즘에 사용되는 seed 값 설정하여 다양한 난수 생성 가능
 * -> seed 값이 같은 Random 클래스는 같은 난수를 산출
 */

public class RandomEx01 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1);	// seed 고정
		
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis()); // seed 변경
		
		// seed가 고정되어 있기 때문에 출력되는 결과도 고정
		System.out.println("rand==>");
		for(int i = 0; i < 5; i++)
			// nextInt(100) : 0~99 정수형 난수 발생
			System.out.println(i + ":" + rand.nextInt(100));
		
		// seed가 current time in milliseconds으로 출력되는 결과도 매번 다름
		System.out.println();
		System.out.println("rand2==>");
		for(int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand2.nextInt(100));
	}
}
