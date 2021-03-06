package ch12.ex;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println("올해 년도 : "+today.get(Calendar.YEAR));
		System.out.println("이번달(0:1월 ~ 11:12월):" 
		                     + (today.get(Calendar.MONTH)+1));
		System.out.println("년도기준 몇째주:" 
		                         + today.get(Calendar.WEEK_OF_YEAR)); 
		System.out.println("월기준 몇째주:" 
								+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자:" + today.get(Calendar.DATE));
		System.out.println("일자:" + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도기준날짜:"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1:일~7:토):"
		                           + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("일기준 몇째요일:"
                + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));	
		System.out.println("오전(0)_오후(1):" + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11):" + today.get(Calendar.HOUR));
		System.out.println("시간(0~23):" 
		                         + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):"+ today.get(Calendar.MINUTE));
		System.out.println("초(0~59):"+ today.get(Calendar.SECOND));
		System.out.println("밀리초(0~999):"
		                           + today.get(Calendar.MILLISECOND));
		// today.get(Calendar.ZONE_OFFSET) : �ð��� �и��ʷ� ����
		System.out.println("Timezone(-12~12):"
		         + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		System.out.println("이번달 마지막 날은:" + 
		         today.getActualMaximum(Calendar.DATE));
		Calendar cal = Calendar.getInstance();
		cal.set(2019,(12-1),30);
		System.out.println("?:" + cal.get(Calendar.YEAR) + "년"
				+ (cal.get(Calendar.MONTH)+1) + "월"
				+ cal.get(Calendar.DATE) + "일");
		cal.set(2019,(12-1),31);
		String week= null;
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1 : week="월";break;
		case 2 : week="화";break;
		case 3 : week="수";break;
		case 4 : week="목";break;
		case 5 : week="금";break;
		case 6 : week="토";break;
		case 7 : week="일";break;
		}
		
		System.out.println("?:" + cal.get(Calendar.YEAR) + "년"
				+ (cal.get(Calendar.MONTH)+1) + "월"
				+ cal.getActualMaximum(Calendar.DATE) + "일 "
				+ week+"요일");	}}
