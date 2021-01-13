package ch07.ex;

public class CastingEx {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		car.drive();
		fe = (FireEngine)car;	// 8번째 줄. 컴파일은 OK. 실행 시 에러가 발생.
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}

// Parent
class Car {
	String color;
	int door;
	void drive() {	// 운전하는 기능
		System.out.println("drive, Brrr");
	}
	void stop() {	// 멈추는 기능
		System.out.println("stop!");
	}
}

// Child
class FireEngine extends Car {	// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water~");
	}
}