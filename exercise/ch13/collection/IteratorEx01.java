package ch13.collection;

import java.util.*;

/*
 * Iterator
 * it.hasNext() : 다음에 입력된 주소 있으면 true
 * it.next()	: 다음 주소 return
 */

public class IteratorEx01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			//Object obj = it.next();
			System.out.println(it.next());
		}
		System.out.println("============");
		
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("============");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
