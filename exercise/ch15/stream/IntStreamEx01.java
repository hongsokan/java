package ch15.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx01 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Arrays.stream 메서드 이용해 IntStream 생성");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s + "\t"));
		
		System.out.println("\nIntStream.of 메서드 이용해 IntStream 생성");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.print(s + "\t"));
		
		System.out.println("\nIntStream.range(1,5) 메서드 이용해 IntStream 생성");
		IntStream intstream3 = IntStream.range(1, 5);
		intstream3.forEach(s -> System.out.print(s + "\t"));
		
		System.out.println("\nIntStream.rangeClosed(1,5) 메서드 이용해 IntStream 생성");
		IntStream intstream4 = IntStream.rangeClosed(1, 5);
		intstream4.forEach(s -> System.out.print(s + "\t"));
	}

}
