package ch12.ex;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx2 {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2019-03-09";
		Date d = null;
		try {
			d = sf.parse(strDate);  // String --> Date
		}catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd�� E���� �Դϴ�.");
  	    System.out.println(sf2.format(d));  // Date --> Editting 
	}

}
