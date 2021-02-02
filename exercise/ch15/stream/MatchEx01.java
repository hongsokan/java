package ch15.stream;

import java.util.Arrays;
import java.util.List;

public class MatchEx01 {

	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(
				new Rectangle(8,8), new Circle(5), new Rectangle(2,3));
		boolean result = list.stream().allMatch( a -> (a instanceof Figure));
		System.out.println("list 내부의 요소는 모두 Figure 객체인가? " + result);
		result = list.stream().anyMatch( a -> (a instanceof Circle));
		System.out.println("list 내부의 요소에 Circle 존재? " + result);
		result = list.stream().noneMatch( a -> (a instanceof Rectangle));
		System.out.println("list 내부의 요소의 객체는 Rectangle 객체가 아닌가? " + result);
	}
}

abstract class Figure {
	String type;
	public Figure(String type) {
		this.type = type;
	}
	public abstract double area();
	public abstract double length();
}

class Rectangle extends Figure {
	int w,h;
	Rectangle(int w, int h) {
		super("사각형");
		this.w = w;
		this.h = h;
	}
	@Override
	public double area() {
		return w * h;
	}
	
	@Override
	public double length() {
		return 2 * (w + h);
	}
	
	@Override
	public String toString() {
		return "가로:" + w + ", 높이:" + h + ", 둘레:" + length() + ", 넓이:" + area();
	}
}

class Circle extends Figure {
	int r;
	Circle(int r) {
		super("원");
    	this.r = r;
    }
	@Override
	public double area() {
		return Math.PI * r * r;
	}
	@Override
	public double length() {
		return Math.PI * 2 * r;
	}
	@Override
	public String toString() {
		return "반지름:"+ r + ", 둘레:" + length() + ", 넓이:" + area();
	}
}
