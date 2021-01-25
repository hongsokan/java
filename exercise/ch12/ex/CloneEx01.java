package ch12.ex;
// clone()은 protected이기 때문에 clone() 메소드를 만들어서 class 내부에서 사용해야 한다
// clone()은 반드시 예외처리를 해줘야 한다.
// -> Cloneable 인터페이스 필요, Object.clone() 오바라이딩 필요
class Point implements Cloneable {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();	// 저장되어 있는 자료의 주소를 복사해서 obj로
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}



class CloneEx01 {
	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone();	// 복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}
}
