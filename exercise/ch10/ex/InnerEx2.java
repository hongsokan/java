package ch10.ex;

class Outer2 {
	private static int outercv = 20;
	static StaticInner cv = new StaticInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	static class StaticInner {
		int siv = new Outer2().outeriv;		static int scv = outercv;	}
	static   StaticInner iv2 = new StaticInner();
	InstanceInner iv = new InstanceInner();
	private int outeriv = 10;
	class InstanceInner {
		int iiv = outeriv;		int iiv2 = outercv;	}
	void method( int pv) {
		// !!!! ��������Ŭ�������� ���Ǵ� �޼����� ���������� ���ȭ(final) �Ǿ�� �Ѵ�.
		int i = 0;
		// pv++;
		// i++;
		outeriv++;
		class LocalInner { // ��������Ŭ����
			int liv = outeriv; // �ܺ�Ŭ������ private ��� ���� ����
			int liv2 = outercv;// �ܺ�Ŭ������ private ��� ���� ����
			void method() {
				// ��������Ŭ�������� ����Ŭ������ ���� �޼����� �������� ���� �ȵ�
				// i = 100;
//				pv++;
				System.out.println("i=" + i);
				System.out.println("pv=" + pv);
				System.out.println(liv + "," + liv2);
				System.out.println(outeriv + "," + outercv);// �ܺ�Ŭ������ private ��� ���� ����
			}
		}
		LocalInner li = new LocalInner();
		li.method();	}}
public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);
		System.out.println("====================");
		Outer2.InstanceInner i2 = out.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);
		Outer2.StaticInner i3 = new Outer2.StaticInner();
		System.out.println(i3.siv);
		System.out.println(Outer2.StaticInner.scv);
	}
}
