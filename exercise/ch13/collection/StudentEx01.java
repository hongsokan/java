package ch13.collection;

import java.io.*;
import java.util.*;

// 총 학생 수: 98 (전체 100명이지만, 이름과 학번 같은 학생 2명, 먼저 입력된 학생으로 저장)
// 1학년 :	인원:26	---> 총점순으로 높은 점수 5명 출력
// 학년	학번	이름	국어	영어	수학	총점
// ============================


public class StudentEx01 {

	static Set<KICStudent> col = new HashSet();
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("exercise/ch13/collection/KICStudent.txt"));

		// 파일 읽어서 collection에 저장
		while(sc.hasNext()) {
			col.add(new KICStudent(sc.next()));
		}
		System.out.println("총학생수:" + col.size());
		
		int grade = 1;
		printGrade(grade);
	}
	
	
	public static void printGrade(int grade) {
		List<KICStudent> gradeli = new ArrayList();
		
		for (KICStudent stu : col) {
			// 1)
			if (stu.grade == grade) {
				gradeli.add(stu);
			}
		}
		
		Collections.sort(gradeli, new Comparator<KICStudent>() {
			@Override
			public int compare(KICStudent s1, KICStudent s2) {
				return s2.total - s1.total;
			}
		});
		
		System.out.println(grade + "학년:    인원:" + gradeli.size());
		System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
		System.out.println("====================================================");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(gradeli.get(i));
		}
		// 2)
	}
}


class KICStudent {
	public int grade;
	public int sno;
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	
	public KICStudent(String line) {
		String[] str = line.split(",");
		this.grade = Integer.parseInt(str[0]);
		this.sno = Integer.parseInt(str[1]);
		this.name = str[2];
		this.kor = Integer.parseInt(str[3]);
		this.eng = Integer.parseInt(str[4]);
		this.math = Integer.parseInt(str[5]);
		this.total = kor + eng + math;
	}
	
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof KICStudent) {
			KICStudent s = (KICStudent)obj;
			return (sno == s.sno) && name.equals(s.name);
		}
		else { return false; }
	}
	
	
	@Override
	public String toString() {
		return grade + "\t" + sno + "\t" + name + "\t" + kor + "\t" + 
				eng + "\t" + math + "\t" + total;
	}
}
