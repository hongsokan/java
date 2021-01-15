package ch08.ex;

/*
 * 다형성
 * 매개변수를 인터페이스형으로 사용하는 경우
 * => 메소드의 사용 조건의 의미로 많이 사용됨
 * 
 * 1. interface Repairable
 * 		멤버 없음
 * 2. class Unit
 * 		int hp;
 * 		final int MAX;
 * 		생성자 : hp를 입력 받아 멤버변수에 저장함
 * 3. class AirUnit extends Unit
 * 		생성자 : hp를 입력 받아 멤버변수에 저장함
 * 4. class GroundUnit extends Unit
 * 		생성자 : hp를 입력 받아 멤버변수에 저장함
 * 5. class Tank extends GroundUnit implements Repairable
 * 		toString() 오버라이딩 "Tank"
 * 6. class DropShip extends AirUnit implements Repairable
 * 		toString() 오버라이딩 "DropShip"
 * 7. class Marine implements Repairable
 * 		toString() 오버라이딩 "Marine"
 * 8. class SCV extends GroundUnit implements Repairable
 * 		메소드: repair(Repairable r)
 * 		toString() 오버라이딩 "SCV"
 * 
 */

interface Repairable {}

class Unit {
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}
	
	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);
	}
	
	public String toString() {
		return "DropShip";
	}
}

class Marine implements Repairable {
//	Marine() { }
	
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
	}

	void repair(Repairable r) {
		
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			u.hp = u.MAX;
			System.out.println(r.toString() + " 수리 완료.");
		}
	}
	
	public String toString() {
		return "SCV";
	}
}


public class Exam02 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
		//s.repair(m); // error
		s.repair(s);
	}
}
