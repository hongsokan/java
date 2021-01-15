package ch08.ex;

interface RemoteControl1 {}
interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolumn(int volumn);
	
	default void setMute(boolean state) {
		if(state) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}

class Television implements RemoteControl, RemoteControl1 {
	public int num;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolumn(int volumn) {
		System.out.println("TV의 볼륨을 " + volumn + "으로 설정");
	}
	
}

class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolumn(int volumn) {
		System.out.println("Audio의 볼륨을 " + volumn + "으로 설정");
	}
	
}

public class Exam03 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		
		Television r1 = new Television();
		r1.num = 8;
		r1.turnOff();
		
		rc.turnOn();
		rc.setVolumn(10);
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolumn(20);
		rc.turnOff();
		rc.setMute(false);
		RemoteControl.changeBattery();
	}
}
