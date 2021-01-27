package ch13.collection;
/*
 * Student 클래스 구현
 * 1. 멤버변수 : 학번(studno), 이름(name), 전공(major)
 * 2. 멤버메서드 : toString() 오버라이딩
 * 3. 학번과 이름이 같으면 같은 학생으로 인식하도록 오버라이딩
 * 4. 생성자 : 학번(studno), 이름(name), 전공(major)
 */

import java.util.HashSet;
import java.util.Set;

class Student {
	String studno;
	String name;
	String major;
	
	Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	
	@Override
	public int hashCode() {
		return studno.hashCode() + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return studno.equals(s.studno) && name.equals(s.name);
		}
		else { return false; }
	}
	
	@Override
	public String toString() {
		return "(" + studno + "," + name + "," + major + ")";
	}
}

public class Exam02 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234", "hong", "business"));
		set.add(new Student("2345", "sun", "business"));
		set.add(new Student("2345", "sun", "cs"));
		set.add(new Student("1234", "hong", "statistics"));
		set.add(new Student("4567", "hong", "business"));
		System.out.println("등록 학생 수 : " + set.size()); //3
		System.out.println(set);
	}
}
