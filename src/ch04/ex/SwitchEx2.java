package ch04.ex;

/*
 * switch 구문에 사용되는 자료형 : byte, short, int, char, string
 * switch 구문에 사용되지 않는 자료형 : boolean, long, float, double
 * 
 * 모든 switch 구문은 if문으로 변경 가능
 * 모든 if문을 switch문으로 변경할 수는 없다. (가능한 것도 있고 불가능한 것도 있음)
 */

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;
		
		switch(value ) {
		case 1 : System.out.println(value); break;
		case 2 : System.out.println(value); break;
		default : System.out.println(value); break;
		}
	}

}
