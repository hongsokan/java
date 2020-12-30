package ch03.ex1;
/*
 * 비트연산자 : &(and),|(or),^(XOR),~(not) : 정수값,
 */
public class OpEx07 {
	public static void main(String[] args) {
		System.out.println("6 & 3 = "+(6 & 3));
		/*
		 *  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  &   0010  : 2
		 */
		System.out.println("6 | 3 = "+(6 | 3));
		/*
		 *  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  | : 0111  : 7  
		 */
		System.out.println("6 ^ 3 = "+(6 ^ 3));
		/*
		 *  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  ^ : 0101  : 5  
		 */
		System.out.println("~10 =" + ~10); //-11
		/*
		 * 10 : 00001010
		 * ---------------
		 * ~  : 11110101   : ?
		 * 
		 *
		 */
	}
}
