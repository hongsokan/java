package ch07.ex;

class SingleObject {
	private static SingleObject obj = new SingleObject(); // 100
	private SingleObject() { } // 생성자, 의도적으로 생성자를 만들어 인스턴스 생성을 막았다
	private int value = 100;
	// obj.value;
	public static SingleObject getObject() {
		// SingleObject.getObject()
		return obj; // 100
	}
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) { // obj.value = 5;
		this.value = value;
	}
}

public class SingletonEx {
	public static void main(String[] args) {
		// SingleObject so = new SingleObject(); //생성자 접근 불가. 객체 생성 불가
		// s1과 s2는 같은 객체, 그러므로 같은 주소를 갖게 된다
		SingleObject so1 = SingleObject.getObject();
		SingleObject so2 = SingleObject.getObject();
		System.out.println(so1 + "\t" + so2);

		// o1과 o2는 다른 객체, 주소도 다르다
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1 + "\t" + o2);
		
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		
		so1.setValue(500);
		System.out.println(so1.getValue()); // 500
		System.out.println(so2.getValue()); // 500
		
		if(so1 == so2) {
			System.out.println("so1참조변수 객체와 so2참조변수 객체는 같은 객체");
		}
		
		if(o1 == o2) {
			System.out.println("Object o1 참조변수 객체와 Object o2 참조변수 객체는 같은 객체");
		} else {
			System.out.println("o1과 o2는 다른 객체");
		}
	}

}
