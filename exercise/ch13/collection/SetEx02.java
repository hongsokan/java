package ch13.collection;

import java.util.HashSet;
import java.util.Set;

/*
 * 객체 중복을 논리적 판단하는 기준(동등객체)
 *  1. equals(Object) : 결과 true
 *  2. hashCode()     : 결과 동일
 *  두개의 메서드가 Object의 멤버메서드임
 *  => equals 메서드 오버라이딩
 *  => hashcode() 메서드 오버라이딩
 *  => toString() 메서드 오버라이딩
 */


public class SetEx02 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("hong", 10));
		set.add(new Person("hong", 10));
		System.out.println(set);
		Person p1 = new Person("kim", 20);
		Person p2 = p1;
		set.add(p1);
		set.add(p2);
		System.out.println(set);
	}
}
