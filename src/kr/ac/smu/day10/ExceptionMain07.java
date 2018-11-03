package kr.ac.smu.day10;

import java.util.Random;

/*
 * throw Ű���� 
 * 
 * ����� ���� ���� ó��.
 * JVM�� ���ܷ� �ν����� �ʰ� �������� �ڵ�� �ν�������
 * ����ڰ� ������ ����ó�� �ϰ� ����.
 * ��, ������ Exception class�� ��ӹ޾ƾ��Ѵ�.
 * 
 * 
 * ����ڰ� ������ ����ó�� class�� ����� �ִ�. ��, Exception class�� ��ӹ޾ƾ�.
 */

public class ExceptionMain07 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		
		try {
			int random = r.nextInt(10) + 1;
			System.out.println("������ ���� : " + random);
			
			if(random >= 5) {
				throw new Exception("5���� ū �����Դϴ�.");
			}
			
		} catch(Exception e) {
			System.out.println("���� �߻�!!");
			e.printStackTrace();
		}
		
		System.out.println("main end...");
	}
}
