package kr.ac.smu.day05;

import java.util.Scanner;

public class HandPhoneMain { //실행 class, 객체를 실제로 생성하는 main 메소드 포함.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HandPhone p1 = new HandPhone();
		HandPhone p2 = new HandPhone();
		HandPhone p3 = new HandPhone();
		
		/*
		p1.company = "삼성";
		p2.company = "엘지";
		p3.company = "애플";
		
		System.out.println(p1.company);
		System.out.println(p2.company);
		System.out.println(p3.company);
		*/
		
		//참조 변수 배열을 이용한 출력.
		//HandPhone[] pArr = {p1, p2, p3};
		//HandPhone[] pArr = new HandPhone[] {new HandPhone(), new HandPhone(), new HandPhone()};
		HandPhone[] pArr = new HandPhone[3];
		//현재 참조변수 배열만 선언 한것 뿐이다. heap공간에 참조변수가 가리키는 객체를 생성해야 한다.
		
		//인스턴스생성은 오직 '()' 통해서 생성된다.
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
