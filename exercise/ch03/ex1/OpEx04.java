package ch03.ex1;
// 논리부정 연산자 : !
public class OpEx04 {
	public static void main(String[] args) {
		System.out.println(true);
		System.out.println(!true);
		System.out.println(!false);
		
		int x = 100;
		System.out.println(x<200);
		System.out.println(!(x<200));
		System.out.println(!(5%2==0));
		System.out.println(5%2!=0);
	}
}
