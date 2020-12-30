package ch02.ex1;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수의 선언 및 초기화
		byte b1 = -22;
		byte b2;
		b2 = -128;
		b1 = 127;
		short s1 = -220;
		int i1 = 100;
		long l1 = 1000;
		
		System.out.println("b1=" + b1);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		
		float f1 = 1.0F;
		double d1 = 1.0;
		double d2 = 1.0d;
		
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		
		
		String a1 = new String();
		a1 = "hello";
        String a2 = a1;
//        a1 = "hello";
//        a2 = "hi";
        System.out.println(a1);
        System.out.println(a2);
		
	}

}
