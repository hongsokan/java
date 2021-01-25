package ch13.collection;

import java.util.List;
import java.util.Vector;

// Vector 예제 : Collection 프레임워크 이전에 사용되던 클래스. List의 구현 클래스

public class ListEx02 {
	public static void main(String[] args) {
		List<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
//		list.addElement(5.0); // Vector의 추가기능 메서드. add와 같은 기능
		list.add(5.0);
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("1: " + list);
		System.out.println();
		
		double num = 5.0;
		int index = list.indexOf(num);
		
		if(index >= 0) System.out.println(num + "의 위치: " + index);
		else System.out.println(num + "은 list에 없음");
		System.out.println();
		
		num = 0.3;
		System.out.println(list.indexOf(num)); // 0
		System.out.println(list.indexOf(5.0)); // 2
		System.out.println();
		
		if(list.contains(num)) {
//			list.removeElement(num);
			list.remove(num);
			System.out.println(num + " 삭제됨.");
		}
		System.out.println();
		
		System.out.println("2: " + list);
		System.out.println(list.indexOf(num));
		System.out.println(list.indexOf(5.0));
		System.out.println(list);
	}
}
