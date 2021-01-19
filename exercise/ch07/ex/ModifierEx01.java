package ch07.ex;

/*
 * 접근 제한자
 * 				private < (default) < protected < public
 * 같은 package:  같은 class	  O			  O			O
 * 다른 package:		X		  X			상속가능		O
 */

class Modifier {
	private int v1 = 100;
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("ch07.Modifier.methoud() 메서드");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);
	}
}

class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1="+v1); //v1 변수 접근제어자는 private
//		System.out.println("v2="+v2); //v2 접근제어자 default
		System.out.println("v3="+v3); //v3 접근제어자 protected
		System.out.println("v4="+v4); //모든 접근 허용
	}
}

public class ModifierEx01 {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1); // 접근 불가
		System.out.println(m1.v2);
		m1.method();
		Modifier3 m3 = new Modifier3();
//		System.out.println("m3.v1="+m3.v1);
//		System.out.println("m3.v2="+m3.v2);
//		System.out.println("m3.v3="+m3.v3);
		System.out.println("m3.v4="+m3.v4);
//		Math m = new Math(); // 생성자의 접근제어자가 private. 객체생성 불가
		// Math()는 static으로 이루어졌기 때문에 생성자 필요없을 것.
	}
}
