package ch10.ex;

/*
 * ����Ŭ���� ��ü���� ���Ǵ� this
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;

	class InstanceInner {
		int iv = 100;

		void method1() {
			int iv = 300;

			System.out.println("iv=" + iv); // 10
			System.out.println("this.iv=" + this.iv); // 100
			// Outer3.this.iv : Outer3 Ŭ������ ��� ���� iv ��
			this.iv = 50; // ���氡��
			System.out.println("Outer3.this.iv=" + Outer3.this.iv); // 10
		}
	}
}

public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		Outer3.InstanceInner ii2 =  new Outer3().new InstanceInner();
		ii.method1();
		
	}
}
