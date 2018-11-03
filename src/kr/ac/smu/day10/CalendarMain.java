package kr.ac.smu.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar
 * �߻� Ŭ����
 * 
 * �׻� ����ð� ����.
 * 
 * �ð� ������ �����ؾ��Ҷ�.
 * set() �������̵� �ؼ� ����.
 * 
 * ������ �׷��� class�� �ִ�.
 * 
 * CalendarŬ������ ��ü ������ �� �� ����.
 * 
 * Calendar
 * int get(int CalendarField)
 * 
 * �⵵ 
 * public static final YEAR = 1;
 * get(1); = get(Calendar.YEAR);
 * 
 * getTime() => Cal���� Date������
 */
public class CalendarMain {

	public static void main(String[] args) {
		
//		Date d = new Date();
//		System.out.println("d : " + d);
//		System.out.println("=========================================");
//		
		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		
		//��¥ ���� : 2018�� 1�� 16��(ȭ)
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)  +1 ;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); //1(��) ~ 7(��)
		String[] dayArr = {"", "��", "��", "ȭ", "��", "��", "��", "��"}; //0 ~ 6
		
		System.out.println("��¥���� : " + year + "��" + month + "��" + date + "��(" + dayArr[day] + ")");
		
		System.out.println("=======================================");
		//2016�� 9�� 23�� ���� ����
		
		c.set(2016, 9-1, 23);
		//���� ����??
		System.out.println("2016�� 9�� 23���� " + dayArr[c.get(Calendar.DAY_OF_WEEK)] + "�Դϴ�.");
		
//		int maxDate = c.getActualMaximum(Calendar.MONTH); //�� �߿��� ���� ū ��.
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH); //�� �߿��� ���� ū ��.
		System.out.println("maxDate : " + maxDate);
		System.out.println("9���� " + maxDate + "�� �����Ǿ��ֽ��ϴ�.");
		
		Date d = c.getTime();
		System.out.println("d : " + d);
		d = new Date();
		c.setTime(d);
		
		System.out.println(c.get(Calendar.YEAR) + "��" + c.get(Calendar.MONTH) + 1 + "��" + c.get(Calendar.DATE) + "��");
		
		
		System.out.println("==================================");
		
		//��¥ ���� : 2018�� 1�� 16��(ȭ)
		String pattern = "yyyy�� MM�� dd��(E)";
		String pattern2 = "yyyy�� MM�� dd��(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //Date������ �޴´�.
		
		System.out.println("��¥ ���� : " + sdf.format(new Date())); 
		
		//�޼ҵ� chain��� .���̿��ؼ�
		c = Calendar.getInstance();
		System.out.println("��¥ ���� : " + sdf.format(c.getTime()));
	}
}
