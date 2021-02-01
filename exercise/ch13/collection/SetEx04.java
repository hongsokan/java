package ch13.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * ���� ���� �������̽�
 * Comparable �������̽� : �߻�޼��� compareTo(Object)
 *                      Ŭ������ �⺻ ���� ��� ���� 
 * Comparator �������̽� : �߻�޼��� compare(Object o1, Object o2)
 *                      �⺻���� ��� ��� �������� �ʰ� ����ڰ� ���Ƿ� ���� ����� ����                     
 */
class Phone implements Comparable<Phone> {
	String name;
	int number;

	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String toString() {
		return "(" + name + "," + number + ")";
	}

	@Override
	public int compareTo(Phone p) {
		return name.compareTo(p.name);
	}
}

public class SetEx04 {
	public static void main(String[] args) {
		System.out.println("�̸������� ���");
		TreeSet<Phone> set = new TreeSet<Phone>();
		set.add(new Phone("ȫ�浿", 1234));
		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���1", 5678));
		set.add(new Phone("�̸���", 5678));
		System.out.println(set);
		
		
		
		System.out.println("��ȭ��ȣ������ ���");
		set = new TreeSet<>(new NumberAsc() );
		set.add(new Phone("ȫ�浿", 1234));		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));		System.out.println(set);
		System.out.println("�̸��� �������� ���");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add(new Phone("ȫ�浿", 1234));
		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));
		System.out.println(set);
		System.out.println("��ȭ��ȣ�� �������� ���");
	
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone p1, Phone p2) {
				return p2.number - p1.number;
			}		});
		set.add(new Phone("ȫ�浿", 1234));		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));		System.out.println(set);
	}
}
class NumberAsc implements  Comparator<Phone> {
	@Override
	public int compare(Phone p1, Phone p2) {
		return p1.number - p2.number;	}}
class NumberDesc implements  Comparator<Phone> {
	@Override
	public int compare(Phone p1, Phone p2) {
		return p2.number - p1.number;	}}