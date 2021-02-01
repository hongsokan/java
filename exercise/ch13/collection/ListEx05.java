package ch13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * => Sort(List<> li, Comparator<> c) : ��������� Ŭ������ �ݵ��
 *  Comparator �������̽��� ������ Ŭ������ ������
  */

public class ListEx05 {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("ȫ�浿", 10));
		li.add(new Person("ȫ�浿", 10));
		li.add(new Person("ȫ�浿", 30));
		li.add(new Person("������", 10));
		li.add(new Person("������", 16));
		Person p1 = new Person("���", 20);
		li.add(p1);
		System.out.println(li);
		Comparator<Person> cp = (a, b) -> a.name.compareTo(b.name);
		Collections.sort(li, cp);
		System.out.println(li);

	}

	static <T> void sort(List<T> li, Comparator<T> c) {
		for (int i = 0; i < li.size() - 1; i++) {
			for (int j = 0; j < li.size() - 1 - i; j++) {
				T p1 = li.get(j);
				T p2 = li.get(j + 1);
				if (c.compare(p1, p2) > 0) {
					li.set(j, p2);
					li.set(j + 1, p1);
				}

			}

		}
	}
}
