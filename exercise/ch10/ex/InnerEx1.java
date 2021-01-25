package ch10.ex;


class Outer1 {
	class InstanceInner { 
		int iv = 100;
	//	static int cv = 10; 
		final static int MAX = 200; 
	}
	static class StaticInner {
		int iv = 300; 	static int cv = 400;
		final static int MAX = 500;	}
	void method() {
		class LocalInner { 
			int iv = 600;
//			static int cv = 700; 
			final static int MAX=700; } 
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv); //600
		System.out.println(lc.MAX);//700
		System.out.println(LocalInner.MAX);  }//700
	void method2() {
	//	LocalInner lc = new LocalInner(); //=> method() 
	}}
public class InnerEx1 {	
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);//300
		System.out.println(Outer1.StaticInner.cv);//400
		System.out.println(Outer1.StaticInner.MAX);//500
	//    Outer1.InstanceInner ii = new Outer1.InstanceInner();
		Outer1.InstanceInner ii = new Outer1().new InstanceInner();
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		System.out.println(ii2.iv);//100
		System.out.println(Outer1.InstanceInner.MAX);
		outer.method();	}}
