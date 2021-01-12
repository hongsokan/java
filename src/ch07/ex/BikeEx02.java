package ch07.ex;

// 다형성 예제
public class BikeEx02 {
	public static void main(String[] args) {
		AutoBike auto1 = new AutoBike(2);
		AutoBike auto2;
		Bike bike;
		auto1.power(); // AutoBike
		System.out.println(auto1.drive());
		System.out.println("바퀴" + auto1.wheel + "개가 굴러간다");
		System.out.println(auto1.stop());
		
		System.out.println("==========");
		bike = auto1;
		// Bike bike = new AutoBike(2)
		// AutoBike() 내용도 있지만, Bike()에 대한 내용만 보겠다는 것
		// drive()와 stop()은 오버라이딩 되었기 때문에 재정의된 내용만 보겠다는 것
		// bike.power(); // Bike에는 power()가 없다
		System.out.println(bike.drive());
		auto2 = (AutoBike)bike;
		auto2.power();
		System.out.println(auto2.drive());
		System.out.println(auto2.stop());
	}

}
