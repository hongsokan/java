package ch06.constructor;

/*
 * 기본 생성자를 작성하지 않아도 생략된 기본 생성자 존재
 */

public class DefaultPerson {
	String name;
	int age ;
	boolean isHungry;
	
	//public DefaultPerson() {} -- 생략된 기본 생성자

	public static void main(String[] args) {
		DefaultPerson person = new DefaultPerson();
		person.name = "홍길동";
		person.age = 10;
		person.isHungry = false;
	}
	
	void test() {
		new DefaultPerson();
	}
}

