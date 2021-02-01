package ch15.stream;

import java.util.Arrays;
import java.util.stream.Stream;

// 스트림 세팅하는 다양한 방법

public class ArrayToStreamEx01 {

	public static void main(String[] args) {
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 1~2 요소 [b, c]
		stream2.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		System.out.println();
		
		Stream<String> stream3 = Stream.<String>builder()
				.add("자바의")
				.add("스트림을 배우자")
				.add("배우자").build();
		stream3.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream<String> stream4 = Stream.generate(() -> "스트림").limit(5);
		stream4.forEach(s -> System.out.println(s));
		System.out.println();
		
		Stream<Integer> stream5 = Stream.iterate(30, n -> n + 2).limit(10);
		stream5.forEach(s -> System.out.println(s));
	}

}
