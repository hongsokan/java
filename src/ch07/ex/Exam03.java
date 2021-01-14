package ch07.ex;

// 과일, 음료, 과자
class Food {
	int price;
	int point;
	
	Food(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

// 과일
class Fruit extends Food {
	double brix; // 당도
	
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
}

class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price, brix);
	}
	
	public String toString() {
		return "Apple";
	}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
	}
	
	public String toString() {
		return "Peach";
	}
}

// 음료
class Drink extends Food {
	int ml; // 용량
	
	Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
}

class Coke extends Drink {
	Coke(int price, int ml) {
		super(price, ml);
	}
	
	public String toString() {
		return "Coke";
	}
}

class Sidar extends Drink {
	Sidar(int price, int ml) {
		super(price, ml);
	}
	
	public String toString() {
		return "Sidar";
	}
}

// 과자
class Snack extends Food {
	int gram; // 무게
	
	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
	}
	
	public String toString() {
		return "Biscuit";
	}
}

class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price, gram);
	}
	
	public String toString() {
		return "Cookie";
	}
}


class Buyer2 {
	int money = 20000;
	int point, cnt;
	Food[] cart = new Food[6];
	
	void buy(Food f) {
		money -= f.price;
		point += f.point;
		System.out.println(f + "구입");
		cart[cnt++] = f;
	}
	
	void summary() {
		int sum = 0;
		String productList = "";
		for (Food f : cart) {
			if (f == null) break;
			System.out.println(f + " 가격 = " + f.price + ", 포인트= " + f.point);
			productList += f + ", ";
			sum += f.price;
		}
		
		productList = productList.substring(0, productList.length()-2);
		System.out.println();
		System.out.println("총 물품 구매액: " + sum);
		System.out.println("총 물품 목록: " + productList);
	}
}



public class Exam03 {
	public static void main(String[] args) {
		
		Apple apple = new Apple(1000, 10.5);
		// System.out.println("사과 가격:" + apple.price);
		// System.out.println("사과 당도:" + apple.brix);
		
		Peach peach = new Peach(1000, 13.5);
		Coke coke = new Coke(500, 500);
		Sidar sidar = new Sidar(1500, 1000);
		Biscuit bis = new Biscuit(10000, 500);
		Cookie cookie = new Cookie(500, 5000);
		
		Buyer2 b = new Buyer2();
		b.buy(apple);
		b.buy(peach);
		b.buy(coke);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		System.out.println();
		
		System.out.println("고객 잔액:" + b.money);
		System.out.println("고객 포인트:" + b.point);
		System.out.println();
		
		b.summary();
	}
}
