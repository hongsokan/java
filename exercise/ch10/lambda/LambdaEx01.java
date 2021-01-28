package ch10.lambda;

@FunctionalInterface
interface LambdaInterface1 {
	void method();
}

public class LambdaEx01 {
	public static void main(String[] args) {
		
		// 기존 방식
		// 1. 익명클래스
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존 방식으로 코딩");
			}
		};
		// 2. 구현클래스
		LambdaInterface1 fi2 = new LambdaClass() ;
		
		// 3. 람다를 이용한 클래스 정의
		LambdaInterface1 fi3 = () -> {
			String str = "method call 1";
			System.out.println(str);
		};
		
		fi.method();
		fi2.method();
		fi3.method();
		execute(fi2);
		
		System.out.println("====================");
		// 1
		fi = () -> {
			String str = "method call 1";
			System.out.println(str);
		};
		fi.method();
		
		// 1
		execute(fi);
		
		// 2
		fi = () -> { System.out.println("method call 2"); };
		fi.method();
		
		// 3
		fi = () -> {
			System.out.println("method call 3");
		};
		fi.method();
		
		// 4
		fi = () -> System.out.println("method call 4");
		fi.method();
		
		// 5. 메소드에 람다 정의
		execute(() -> System.out.println("method call 5"));
	}
	
	static void execute(LambdaInterface1 f) {
		f.method();
	}
}


class LambdaClass implements LambdaInterface1 {
	@Override
	public void method() {
		System.out.println("Lambda Class");
	}
}
