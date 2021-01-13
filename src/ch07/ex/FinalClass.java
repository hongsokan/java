package ch07.ex;

/*
 * final 제어자: 변경 불가의 의미
 * final 클래스: 
 * 		상속 불가 클래스. (상속을 받을 수는 있지만 줄 수는 없다는 뜻)
 * 		다른 클래스의 부모클래스 불가
 * 		String 클래스가 final 클래스임
 */

public final class FinalClass extends Aaa {

}

// FinalClass는 상속을 받을 수 없다
//class SubClass extends FinalClass {}

class Aaa {}