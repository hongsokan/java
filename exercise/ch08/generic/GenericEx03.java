package ch08.generic;

class Product<A, B> {
	private A kind;
	private B model;
	
	public A getKind() {
		return this.kind;
	}
	
	public B getModel() {
		return this.model;
	}

	public void setKind(A kind) {
		this.kind = kind;
	}

	public void setModel(B model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}
}

class Car {
	@Override
	public String toString() {
		return "car";
	}
}
class Tv {
	@Override
	public String toString() {
		return "tv";
	}
}

public class GenericEx03 {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(product1);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(product2);
		
	}
}
