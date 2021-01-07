package ch06.ex;

/*
 * 클래스의 배열 
 */

public class PhoneEx2 {

	public static void main(String[] args) {
		Phone[] parr = new Phone[3]; // 인스턴스 타입은 Phone 클래스 
		// 반복문을 통해 3개의 인스턴스 생성 
		for (int i = 0; i < parr.length; i++) {
			Phone p = new Phone();
			parr[i] = p;
			parr[i].no = i + "1234";
			// no : 012345, 11234, 21234 
		}
		
		for (int i = 0; i < parr.length; i++) {
			System.out.printf("parr[%d].no=%s\n", i, parr[i].no);
			parr[i].send((i==0) ? parr[parr.length-1].no : parr[i-1].no);
		}

	}

}
