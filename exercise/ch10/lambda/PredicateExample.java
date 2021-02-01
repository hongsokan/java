package ch10.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate : 매개값 조사해 true 또는 false를 리턴할 때 사용

public class PredicateExample {
	static class Student {
		private String name;
		private String sex;
		private int score;
		
		public Student(String name, String sex, int score) {
			this.name = name;
			this.sex = sex;
			this.score = score;
		}
		
		public String getSex() {
			return sex;
		}
		
		public int getScore() {
			return score;
		}
	}
	
	private static List<Student> list = Arrays.asList(
			new Student("hong", "male", 90),
			new Student("kim", "female", 90),
			new Student("kam", "male", 95),
			new Student("park", "female", 92)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg( t -> t.getSex().equals("male") );
		System.out.println("남자 평균 점수 : " + maleAvg);
		
		double femaleAvg = avg( t -> t.getSex().equals("female") );
		System.out.println("여자 평균 점수 : " + femaleAvg);
	}
}
