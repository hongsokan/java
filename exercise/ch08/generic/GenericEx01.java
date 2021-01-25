package ch08.generic;

class MyClass01 {
	@Override
	public String toString() {
		return "MyClass01";
	}
}

class Pool01 {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}

public class GenericEx01 {
	public static void main(String[] args) {
		Pool01 gen = new Pool01();
		gen.set("그랜져");
		
		String name = (String) gen.get();
		System.out.println(name);
		
		MyClass01 my = new MyClass01();
		gen.set(my);
		
		MyClass01 g = (MyClass01) gen.get();
		System.out.println(g);
		
		gen.set(1);
		Integer i = (Integer) gen.get();
		System.out.println(i);
	}
}
