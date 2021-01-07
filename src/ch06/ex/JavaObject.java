package ch06.ex;


// 1. 자바에서 사용하는 모든 클래스는 java.lang.Object 클래스를 상속 받는다. 
// 2. 참조변수를 프린트 시에는 toString() 메소드를 프린트 한다. 

public class JavaObject {

	public static void main(String[] args) {
		Aaa a1 = new Aaa();
		Object o = new Object(); 
		System.out.println(o);
		System.out.println(a1);

	}

}

// class Aaa extends Object와 같다. (모든 클래스는 Object 클래스 상속)
class Aaa {
	int num = 1234;
	
	// 아래의 toString() 이 없으면 
	
	@Override
	public String toString() { // 재정의해서 원하는 결과를 프린트할 수 있다. 
		return num + " 입니다 ";
	}
}