package kr.ac.smu.day05;

import java.util.Scanner;

public class HandPhoneMain { //���� class, ��ü�� ������ �����ϴ� main �޼ҵ� ����.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HandPhone p1 = new HandPhone();
		HandPhone p2 = new HandPhone();
		HandPhone p3 = new HandPhone();
		
		/*
		p1.company = "�Ｚ";
		p2.company = "����";
		p3.company = "����";
		
		System.out.println(p1.company);
		System.out.println(p2.company);
		System.out.println(p3.company);
		*/
		
		//���� ���� �迭�� �̿��� ���.
		//HandPhone[] pArr = {p1, p2, p3};
		//HandPhone[] pArr = new HandPhone[] {new HandPhone(), new HandPhone(), new HandPhone()};
		HandPhone[] pArr = new HandPhone[3];
		//���� �������� �迭�� ���� �Ѱ� ���̴�. heap������ ���������� ����Ű�� ��ü�� �����ؾ� �Ѵ�.
		
		//�ν��Ͻ������� ���� '()' ���ؼ� �����ȴ�.
		for(int i = 0; i<pArr.length; i++) {
			pArr[i] = new HandPhone();
		}
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i].name = sc.nextLine();
		}
		
		for(int i = 0; i<pArr.length; i++) {
			System.out.println(pArr[i].name);
		}
	}
}
