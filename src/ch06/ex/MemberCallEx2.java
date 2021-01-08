package ch06.ex;

public class MemberCallEx2 {
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;
	
	public static void main(String[] args) {
		MemberCallEx2 m = new MemberCallEx2();
		cv2 = m.iv1;
		m.method1();
		method2();
	}
	
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
		System.out.println();
	}
	
	static void method2() {
		MemberCallEx2 m = new MemberCallEx2();
		System.out.println(cv1 + cv2);
		System.out.println(m.iv1 + m.iv2);
		System.out.println();
	}

}
