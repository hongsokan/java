package ch15.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"hong", "kim", "lee", "sung", "lim", "hyang"});
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\n내부 반복자 이용");
		list.stream().forEach(s -> System.out.println(s));

	}

}
