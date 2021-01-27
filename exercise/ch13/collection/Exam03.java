package ch13.collection;

import java.util.*;


public class Exam03 {

	public static void main(String[] args) {
		Set<Integer> ball = new TreeSet<>();
		
		while(ball.size() < 4) {
			ball.add((int)(Math.random() * 45) + 1);
		}
		
		System.out.println(ball);
	}

}
