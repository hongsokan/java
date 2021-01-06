package ch05.ex;

/*
 * command line에서 파라미터 받기
 */

public class Ex06 {

	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("커맨드라인에 파라미터 입력");
			System.out.println("java ch05.Ex06 aaa bbb");
			return;
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
	}

}
