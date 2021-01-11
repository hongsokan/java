package ch06.ex;

/*
 * 처음 class 선언 시에 한번 static {} 이 실행됨
 * new Block() 시에는 instance {} 가 실행됨
 */

class Block {
	Block() {
		System.out.println("생성자");
	}
	
	static int cv = 5;
	int iv = 10;
	
	static {
		System.out.println("static block: " + cv);
	}
	
	{
		System.out.println("instance block: " + iv);
	}
}

public class InitEx2 {
	public static void main(String[] args) {
		Block b1 = new Block();
		System.out.println("===========");
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
		Block b5 = new Block();
	}
}
