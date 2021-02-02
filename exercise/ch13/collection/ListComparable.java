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
//		sortMs(li);
//		sort(li);
		System.out.println(li);
	}
	
	static void sortMs(List<Person> li) {
		for (int i = 0; i < li.size() - 1; i++) {
			for (int j = 0; j < li.size()-1-i; j++) {
				Person p1 = li.get(j);
				Person p2 = li.get(j+1);
				
				if (p1.compareTo(p2) > 0) {
					li.set(j, p2);
					li.set(j+1, p1);
				}
			}
		}
	}
	
	static void sort(List<Person> li) {
		for (int i = 0; i < li.size() - 1; i++) {
			for (int j = 0; j < li.size()-1-i; j++) {
				Person p1 = li.get(j);
				Person p2 = li.get(j+1);
				
				if (p1.compareTo(p2) > 0) {
					li.set(j, p2);
					li.set(j+1, p1);
				}
			}
		}
	}

}
