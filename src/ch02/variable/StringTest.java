package ch02.variable;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "String怨� char�뒗 �떎瑜대떎";// String怨� char�뒗 �떎瑜대떎

		System.out.println(s1);

		String s2 = "Hello\t\'Java\'\tWorld";// Hello 'Java' World
		System.out.println(s2);

		String s3 = 1 + "+ " + 2 + " = " + (1 + 2);
		System.out.println(s3);

		System.out.println("1" + "1"); // 11
		System.out.println(1 + "1");// 11
		System.out.println(1 + 1 + "1");// 21
		System.out.println(1 + "1" + 1);// 111
		System.out.println('1' + '1');// 98
		
		System.out.println("1 + 2 + 3");
		System.out.println("합계: "+1+2+3);
		System.out.println(1+2+3 + "합계");
	}

}
