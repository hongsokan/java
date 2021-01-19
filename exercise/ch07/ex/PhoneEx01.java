package ch07.ex;

/*
 * 상속 예제
 * 1. 자손객체 생성 시 부모객체 먼저 생성
 * 2. 자손객체는 부모객체의 맴버에 접근 가능
 * 3. 클래스 간 상속은 단일 상속만 가능. 자손클래스의 부모는 한개만 가능
 * 4. 모든 클래스는 Object 클래스 상속받음. 
 * 	모든 객체는 Object 클래스의 객체 포함. 모든 객체는 Object클래스 맴버에 접근 가능.
 */

class Phone {
	boolean power;
	int number;
	
	void power() {
		power = !power;
	}
	
	void send() {
		if(power) {
			System.out.println("전화걸기");
		}
	}
	
	void receive() {
		if(power) {
			System.out.println("전화받기");
		}
	}
}

class SmartPhone extends Phone {
	void setApp(String name) {
		if(power) {
			System.out.println(name + "설치중");
		}
	}
}

public class PhoneEx01 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		System.out.println(sp.toString());
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("네이버");
	}
}
