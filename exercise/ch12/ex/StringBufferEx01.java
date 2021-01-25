package ch12.ex;

// StringBuffer 는 equals() 오버라이딩 되지 않음

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb == sb2 ? " + sb.equals(sb2));

		// StringBuffer의 내용을 String으로 변환한다
		String s = sb.toString();
		
		// String s = new String(sb); 와 같다
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}
}
