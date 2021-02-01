package ch13.collection;

import java.util.HashSet;
import java.util.Set;

/*
 * ��ü�� �ߺ��� ���� �Ǵ��ϴ� ����(���ü)
 *  1. equals(Object) : ����� true
 *  2. hashCode()     : ����� ����
 *  �ΰ��� �޼��尡 Object�� ��� �޼�����
 *  => equals �޼��带 �������̵�   
 *  => hashcode() �޼��嵵 �������̵� 
 *  => toString() �޼��� �������̵� 
 */


public class SetEx02 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("ȫ�浿", 10));
		set.add(new Person("ȫ�浿", 10));
		System.out.println(set);
		Person p1 = new Person("���", 20);
		Person p2 = p1;
		set.add(p1);
		set.add(p2);
		System.out.println(set);
	}
}
