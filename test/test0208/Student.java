package test0208;

class Student {
	private String name;
	private int kor, eng;
	
	Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	String getName() {
		return this.name;
	}
	
	int getKor() {
		return this.kor;
	}
	
	int getEng() {
		return this.eng;
	}
}
