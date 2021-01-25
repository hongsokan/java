package ch13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx01 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(0);
		System.out.println(list);

		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
		
		// 부분리스트 리턴
		// list.subList(1, 4);
		// System.out.println(list.subList(1, 4));
		
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println("list2 : " + list2);
		System.out.println();
		
		// list2 정렬
		// Collections는 Collection프레임워크 관련된 추가 기능을 멤버로 가진 클래스이다
		Collections.sort(list2); // list2 List 객체를 정렬
		System.out.println("list2 sort : " + list2);
	}
}
