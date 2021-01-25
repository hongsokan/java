package ch10.ex;

/*
 * ������ ���� Ŭ����
 */
interface I {	void test();}
abstract class Abs {	abstract void test();}
public class InnerEx4 {
	 
	public static void main(String[] args) {
		
		int iv = 9999;
		I i = new I() {	int iv = 100;
			@Override
			public void test() {
				System.out.println("iv=" + iv);
				System.out.println("this.iv=" + this.iv);
				System.out.println("I ���� Ŭ������ test �޼���");
				
			}		};		i.test();
		// iv ����� I �������̽��� ����� �ƴϹǷ� ���� �Ұ�
	//	 System.out.println(i.iv);//error
	
	     //iv++;
		// ������ ����Ŭ������ ��������Ŭ������.
		// ��������Ŭ�������� ���Ǵ� ���������� ���ȭ�� �ʿ���.
		Abs a = new Abs() {
			@Override 			void test() {
				System.out.println("iv=" + iv); // �������� iv ���
				System.out.println("Abs ���� Ŭ������ test �޼���");
			}		};
			
			
		a.test();	}}
