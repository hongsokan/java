package ch12.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = 
				 new SimpleDateFormat("dd-MM-yyyy HH:mm:ss E a");
		String dispDate = sf.format(now);
		System.out.println(dispDate);
		String strDate = "2019-09-21"; 
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf2.parse(strDate);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		System.out.println(day);
		System.out.println(sf.format(day));
		
		strDate = "2019��12��31��";
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy��MM��dd��");
		try {
			day = sf3.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sf4 = 
         new SimpleDateFormat("yyyy-MM-dd ��¥�� ������ E���� �Դϴ�.");
		System.out.println(sf4.format(day));
	}
}
