package kr.ac.smu.day11;

import java.lang.invoke.StringConcatFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar class
 * 
 * -�߻� Ŭ���� �̴�.
 * -��ü ���� ���ϰ� �޼ҵ�� Ŭ���� �� �̿��ؼ� �����Ѵ�.
 * 
 */
public class CalendarMain {

	public static void main(String[] args) {
		
		//���� �ð� ��ȯ.
		Calendar c = Calendar.getInstance();
		
		System.out.println("c : " + c);
		
		//c ������ �̿��Ͽ� Calendar�� ��� ������ ���� ���� ��,��,�� ���� �˾Ƴ���.
		
		System.out.println("���� ��¥ : " + c.get(Calendar.YEAR) + (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH));
		
		//2016�� 9�� 23�� ����.
		c.set(2016, 9-1, 23);
		System.out.println("����� ��¥ : " + c.get(Calendar.YEAR) + (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH));
		
		//2016�� 9�� 23�� ��������??
		String[] dayArr = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		String day = dayArr[c.get(Calendar.DAY_OF_WEEK)];
		System.out.println("2016�� 9�� 23����  " + day);
		
		
		c.set(2015, 12-1, 25);
		Date d = c.getTime();
		System.out.println("d : " + d);
		//d = new Date(); //new�ϸ� �ٽ� ����ð�����.
		
		System.out.println(c.get(Calendar.YEAR));
		
		//��� ���� ����.
		String pattern1 = "yyyy�� MM�� dd��";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
		System.out.println(sdf.format(d));
		
	}
}
