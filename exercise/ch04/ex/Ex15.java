package ch04.ex;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("포인트 입력 (1~1000) exit(9999)");
		int point = 0;
		while(true) {
			point = scan.nextInt();
			if (point == 9999) { System.out.println("exit"); break; }
			System.out.println(point + "점");
			switch(point/200) {
			case 0 : System.out.println("상품이 없습니다.");
			break;
			case 4 : System.out.println("자동차");
			case 3 : System.out.println("컴퓨터");
			case 2 : System.out.println("핸드폰");
			case 1 : System.out.println("새우깡");
			}
		}
	}

}
