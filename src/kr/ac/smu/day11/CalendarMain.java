package kr.ac.smu.day11;

import java.lang.invoke.StringConcatFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar class
 * 
 * -추상 클래스 이다.
 * -객체 생성 못하고 메소드는 클래스 명 이용해서 접군한다.
 * 
 */
public class CalendarMain {

	public static void main(String[] args) {
		
		//현재 시간 반환.
		Calendar c = Calendar.getInstance();
		
		System.out.println("c : " + c);
		
		//c 변수를 이용하여 Calendar의 상수 접근을 통해 현재 년,월,일 등을 알아낸다.
		
		System.out.println("오늘 날짜 : " + c.get(Calendar.YEAR) + (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH));
		
		//2016년 9월 23일 세팅.
		c.set(2016, 9-1, 23);
		System.out.println("변경된 날짜 : " + c.get(Calendar.YEAR) + (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH));
		
		//2016년 9월 23일 무슨요일??
		String[] dayArr = {"", "일", "월", "화", "수", "목", "금", "토"};
		String day = dayArr[c.get(Calendar.DAY_OF_WEEK)];
		System.out.println("2016년 9월 23일은  " + day);
		
		
		c.set(2015, 12-1, 25);
		Date d = c.getTime();
		System.out.println("d : " + d);
		//d = new Date(); //new하면 다시 현재시간으로.
		
		System.out.println(c.get(Calendar.YEAR));
		
		//출력 포맷 지정.
		String pattern1 = "yyyy년 MM월 dd일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
		System.out.println(sdf.format(d));
		
	}
}
