package ch12.ex;

public class ClassEx01 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.num = 99;
		System.out.println(s);
		try {
			// 변수 명으로 클래스를 만들어서 처리할 수 있다
			Class<?> c = Class.forName("ch12_API.Sample");
			Sample e = (Sample) c.newInstance();
			e.num = 10;
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

class Sample {
	int num;
	
	@Override
	public String toString() {
		return num + "";
	}
}