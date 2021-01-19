package ch08.ex;

public class ComplexerEx02 {

	public static void main(String[] args) {
		Complexer com = new Complexer();
		if(com instanceof Complexer)
			System.out.println("com 객체는 Complexer 객체");
		// class Complexer implements Printerable, Scannerable, Faxable
		// ComplexerEx01 에서 이렇게 선언한 경우 Complexerable은 출력되지 않음
		if(com instanceof Complexerable)
			System.out.println("com 객체는 Complexerable 객체");
		if(com instanceof Printerable)
			System.out.println("com 객체는 Printerable 객체");
		if(com instanceof Scannerable)
			System.out.println("com 객체는 Scannerable 객체");
		if(com instanceof Faxable)
			System.out.println("com 객체는 Faxable 객체");
		if(com instanceof Object)
			System.out.println("com 객체는 Object 객체");
	}

}
