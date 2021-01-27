package ch10.lambda;

/*
 * 1) 논리적 순위 정의
 * Comparable<T> : sort 시 순위 사용
 * public int compareTo
 * 
 * 2) 논리적 동등 정의 : Set add() 시 동등 확인
 * Object
 * public boolean equals
 * public int hashCode()
 */


class Person implements Comparable<Person> {
	String name;
	int age;
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "=" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age; 
	}
	
	@Override 
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override 
	public int compareTo(Person o) {
		return (o.age - age) * -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
