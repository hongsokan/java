package ch13.collection;

import java.util.HashSet;
import java.util.Set;

/*
 * Set 인터페이스 : 중복 객체 저장x
 *   구현클래스 : HashSet, LinkedHashSet, TreeSet
 */
public class SetEx01 {
	public static void main(String[] args) {
		Object[] arr = { "hong", 1, "1", "kim", "lee", 
				"hong", "sung", "hyang", "hong", "kim" };
		Set<Object> set1 = new HashSet<Object>();
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();

		for (int i = 0; i < arr.length; i++) {
			if (!set1.add(arr[i])) {
				if (!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
