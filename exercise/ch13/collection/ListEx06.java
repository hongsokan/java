package ch13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx06 {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("hong", 10));
		li.add(new Person("hong", 10));
		li.add(new Person("hong", 30));
		li.add(new Person("lee", 10));
		li.add(new Person("kim", 16));

		Person p1 = new Person("kim2", 20);
		li.add(p1);
		System.out.println(li);
		
		Collections.sort(li, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.name.compareTo(o2.name));
			}
		});	
		System.out.println(li);
		System.out.println();
		
		
		// 람다식 활용
		Comparator<Person> cp = (a,b) -> a.name.compareTo(b.name);
		Collections.sort(li, cp);
		System.out.println(li);
		System.out.println();
		
		Comparator<Person> cp2 = (a,b) -> b.age - a.age;
		Collections.sort(li, cp2);
		System.out.println(li);
	}
}
