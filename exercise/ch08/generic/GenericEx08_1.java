package ch08.generic;

class MyArrayList2 <T> {
	Object[] v = new Object[3];
	int index = 0;

	public void add(T t) {
		if(index == v.length) {
			System.out.println("length 추가 " + v.length);
			Object[] temp = new Object[v.length + 2]; //13
			System.arraycopy(v, 0, temp, 0, v.length);
			v = temp;
		}
		v[index++] = t;
	}
	
	public T get(int i) {
		return (T)v[i];
	}
	
	public void list() {
		for(Object s : v) {
			if(s == null) break;
			System.out.println((T)s);
		}
		System.out.println();
	}
}

public class GenericEx08_1 {
	public static void main(String[] args) {
		MyArrayList2<Student> t1 = new MyArrayList2<Student>();
		t1.add(new Student(18, "김xx"));
		t1.add(new Student(25, "박xx"));
		t1.add(new Student(12, "나xx"));
		t1.list();
	}
}

class Student {
	int age;
	String name;
	
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + ":" + name;
	}
}