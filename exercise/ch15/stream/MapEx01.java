package ch15.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapEx01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hong", "chun", "gu", "jeon", "sa");
		System.out.println();
		IntStream st = list.stream().mapToInt(String::length);
		
		st.forEach(len -> System.out.println(len));
		
		System.out.println();
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));

	}

}
