package ch12.ex;

public class Exam01 {
	// a : "문자열소스", b : "찾는 문자열", 문자열에서 찾는 문자열의 갯수 리턴
	static int count (String a, String b) {
		int idx = 0, cnt = 0;
		while(true) {
			idx = a.indexOf(b, idx);
			if(idx == -1) break;
			idx++;
			cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "12")); // 2
		System.out.println(count("12345AB12AB345AB", "AB")); // 3
		System.out.println(count("12345", "6")); // 0
	}
}
