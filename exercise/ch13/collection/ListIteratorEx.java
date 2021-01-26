package ch13.collection;

import java.util.*;
import java.util.ArrayList;

public class ListIteratorEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		for(int i = 1; i <= 5; i++) {
			list.add(i * 100);
		}
		
		ListIterator lit = list.listIterator();

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println("===============");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
