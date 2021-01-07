package ch06.ex;

/*
 * 지역변수 : 메서드 내부에서 선언된 변수.
 * 			반드시 초기화 되어야 한다.
 * 			매개변수는 지역변수다.
 */

public class LocalValEx {

	static String grade2;
	
	public static void main(String[] args) {
		// args : 지역변수 
		int num = 200; // 지역변수
		boolean b = true; // 지역변수
		if (b) num = 100;
		System.out.println(num);
		String grade;
		int score = 80;
		switch(score/10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		System.out.println("학점 : " + grade);
	}

}
