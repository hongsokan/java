package ch13.collection;

import java.io.File;
import java.io.FileNotFoundException;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



/*
 * ���л���:98  ---> ��ü �ο��� 100�������� �̸��� �й��� ���� �л��� ���� �Էµ� �л����� 
 *                 �Է��� �Ѵ� (���߿� �Էµ� ���� �л��� �Է� �Ұ���)
1�г�:   �ο�:26    ---> ���������� ���� ���� ���� 5�� ����Ʈ �Ѵ�

�г� 	�й� 	�̸� 	���� 	���� 	���� 	����
=======================================================
1	688	ETD	100	35	90	225
1	273	WHN	65	55	85	205
1	866	VCH	65	80	45	190
1	708	CMW	65	60	60	185
1	978	BPI	90	15	75	180
 */



public class KICStudentEx1_1 {
	static Set<KICStudent1> col = new HashSet();  //equals, hashcode Ȯ�� 
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/ch13/collection/KICStudent.txt"));
		// ������ �о collection�� ���� �մϴ� 
		while(sc.hasNext()) {
			col.add(new KICStudent1(sc.next()));
		}
		System.out.println("���л���:"+col.size());
		
		int grade = 1;  //1�г� �л��� ���� ���������� 5�� ����Ʈ
		printGrade(grade);
	}
	
	public static void  printGrade(int grade) {
		   List<KICStudent1> gradeli = new ArrayList();
		  for (KICStudent1  stu : col) {
			if(stu.grade==grade) gradeli.add(stu);
		  }
	//		Collections.sort(gradeli);  //Comparable   compareTo()
		  Collections.sort(gradeli, new Comparator<KICStudent1>() {

			@Override
			public int compare(KICStudent1 o1, KICStudent1 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}

		
		});
			
			System.out.println(grade+"�г�:   �ο�:"+gradeli.size());
			System.out.println("�г� \t�й� \t�̸� \t���� \t���� \t���� \t����");
			System.out.println("=======================================================");
			for (int rank = 0 ; rank < 5 ; rank++) {
				System.out.println(gradeli.get(rank));
				
			}
		}
}

class KICStudent1 implements  Comparable<KICStudent1>{
	public int grade;  //�г�
	public int sno;   //�й�
	public String name;  //�̸� 
	public int kor;  //����
	public int eng;  //����
	public int math; //����
	public int total; //�հ�

	public KICStudent1(String line) {
		
		String[] str = line.split(",");
		this.grade = Integer.parseInt(str[0]);
		this.sno = Integer.parseInt(str[1]);
		this.name = str[2];
		this.kor = Integer.parseInt(str[3]);
		this.eng = Integer.parseInt(str[4]);
		this.math = Integer.parseInt(str[5]);
		this.total = kor+eng+math;
	}
		
	@Override
	public boolean equals(Object obj) {
			KICStudent1 student = (KICStudent1) obj;
			return (sno == student.sno) && (name.equals(student.name));
			
	}
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
	@Override
	public int compareTo(KICStudent1 o) {
		// TODO Auto-generated method stub
		return o.total-total;
	}
	
	
	@Override
	public String toString() {
		return grade + "\t" + sno + "\t" + name + "\t" + kor + "\t" + eng
				+ "\t" + math + "\t"+total;
	}
	

}
