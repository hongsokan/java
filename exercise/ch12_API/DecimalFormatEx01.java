package ch12_API;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx01 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		try {
			Number num = df1.parse("1,234.56");
			double d = num.doubleValue();
			d += 10;
			System.out.println(d + "->" + df1.format(d));
			System.out.println(d + "->" + df2.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
