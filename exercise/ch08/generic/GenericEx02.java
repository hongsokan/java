package ch08.generic;

class Pool02<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}


public class GenericEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pool02<String> box1 = new Pool02<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		Pool02 box2 = new Pool02();
		box2.set(6);
		int value = (Integer) box2.get();
		System.out.println(value);
	}

}
