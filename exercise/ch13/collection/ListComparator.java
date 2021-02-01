package ch13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * => Sort() : ��������� Ŭ������ �ݵ�� Comparable �������̽��� ������ Ŭ������ ������
 
 */


public class ListComparator {
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
	
		
		
	
		/*
		 * Collections.sort(li, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { // TODO Auto-generated
		 * method stub return (o1.age-o2.age)*-1; }
		 * 
		 * 
		 * });
		 */
		System.out.println("1:"+li);
		// ��Collection 
		Collections.sort(li, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (o1.age-o2.age)*-1;
			}

			
		});
	
		
		System.out.println("2:"+li);
		
		
		
	}
}

