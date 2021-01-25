package ch13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Sort() : 사용자 정의 클래스는 반드시 Comparable 인터페이스

public class ListComparable {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));

		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
	}
}
