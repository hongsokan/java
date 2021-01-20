package ch12_API;
/*
 * 지정된 Wrapper클래스와 기본자료형 사이에는 자동 형변환이 가능 - 박싱, 언박싱
 * 
 * 다른 타입의 Unboxing은 가능 (그대신 기본형 type에 auto casting 조건)
 * 다른 타입의 boxing은 불가함
 * 
 * equals(), hashCode(), toString() 모두 오버라이딩 되어있음
 */

public class WrapperEx01 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(123);
		int iii = i;
		double d = (double)(int)i;
		float f = i;
		Short s = (short)(int)i;
		Double d2 = (double)(int)i;
		
		Double d3 = d;
		System.out.println("i==i2 ? " + (i==i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		System.out.println("i.compareTo(i2)= " + i.compareTo(i2));
		System.out.println("i.toString()= " + i.toString());
		System.out.println("MAX_VALUE= " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE= " + Integer.MIN_VALUE);
		System.out.println("SIZE= " + Integer.SIZE + "bits");
		System.out.println("BYTES= " + Integer.BYTES +"bytes");
		System.out.println("TYPE= " + Integer.TYPE);
	}
}
