package ch13.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * Properties클래스 Hashtable테이블의 하위클래스.
 * Hashtable은 Map인터페이스의 구현클래스이므로 Properties.
 * 클래스도 Map을 구현한 클래스.
 * (key, value) 자료형이 모두 String. 제네릭표현은 안함.
 * - 텍스트파일에 Properties 객체를 추가할 수 있는 기능이 있다.
 */
import java.util.Properties;

public class PropertiesEx01 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		System.out.println(pr);
		
		// a.properties 파일을 지정. 읽을 준비 완료
		FileInputStream fis = new FileInputStream("exercise/ch13/collection/m.properties");
		pr.load(fis);
		System.out.println(pr);
		
//		pr.get("name"); // 키가 name인 객체의 value 리턴
		System.out.println("이름 : " + pr.get("name"));
		
//		pr.getProperty("tel"); // Hashtable이 이전에 사용되던 get 메서드
		System.out.println("전화번호 : " + pr.getProperty("tel"));
		
		pr.put("subject", "컴퓨터공학");
		System.out.println(pr);
		
		// FileOutputStream : 파일 생성하기
		FileOutputStream fos = new FileOutputStream("exercise/ch13/collection/m01.properties");
		
		// pr 객체의 (key, value) 객체를 파일로 생성
		pr.store(fos, "#save");
	}
}
