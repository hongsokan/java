package ch07.ex;

/*
 * 다형성 예제
 * Buyer의 Product 구매
 * 
 * Product 클래스
 * 		멤버변수: int 가격, int 포인트
 * 		생성자(int price) : 가격 입력받고, 가격10%는 포인트
 * Tv 클래스 (parent class:Product)
 * 		생성자(int price) : 가격 100
 * 		toString() 메서드에서 Tv 리턴
 * Computer 클래스 (parent class:Product)
 * 		생성자(int price) : 가격 200
 * 		toString() 메서드에서 Computer 리턴
 * SmartPhone2 클래스 (parent class:Product)
 * 		생성자(int price) : 가격 150
 * 		toString() 메서드에서 SmartPhone2 리턴
 */

class Product {
	int price, point;
	
	Product(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

class Tv extends Product {
	Tv(int price) {
		super(price);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer(int price) {
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}

class SmartPhone2 extends Product {
	SmartPhone2(int price) {
		super(price);
	}
	
	public String toString() {
		return "SmartPhone2";
	}
}

public class Exam02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv(100);
		Computer com = new Computer(200);
		SmartPhone2 sp = new SmartPhone2(150);
		b.buy(tv); // Product p = tv, 상속 받았으므로 타입을 Product로 받을 수 있음 (다형성)
		b.buy(com);
		b.buy(sp);
		System.out.println("구매 후 잔액:" + b.money);
		System.out.println("구매 후 적립포인트:" + b.point);
		System.out.println("====== 구매 제품 정보 ======");
		b.summary();
	}
}

/*
 * Buyer 클래스
 * 멤버변수 : int money = 500, point, cnt
 * 			Product[3] cart = new Product[3];
 * 멤버메서드 : buy(Product p) : p상품의 가격만큼 money 차감
 * 							p상품의 포인트만큼 point 증가
 * 							화면에 구입한 제품 출력
 * 							cart에 제품 추가
 * 			summary() :
 * 					1. 각 구매한 물품의 가격과 포인트 출력
 * 					2. 전체 구매 물품 가격 출력
 * 					3. 젠처 구매 물품 목록 출력
 */

class Buyer {
	int money = 500;
	int point, cnt;
	Product[] cart = new Product[3];
	
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		System.out.println(p + "구입");
		cart[cnt++] = p;
	}
	
	void summary() {
		int sum = 0;
		String productList = "";
		for (Product p : cart) {
			if (p == null) break;
			System.out.println(p + " 상품 : 가격 =" + p.price + ", 포인트=" + p.point);
			productList += p + ", ";
			sum += p.price;
		}
		
		productList = productList.substring(0, productList.length()-2);
		System.out.println();
		System.out.println("총 물품 구매액: " + sum);
		System.out.println("총 물품 목록: " + productList);
	}
}
