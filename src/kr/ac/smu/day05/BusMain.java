package kr.ac.smu.day05;

import java.util.Scanner;

class Bus {

	String name; // 차 이름
	String company;//버스 제작 회사
	String price; // 차 가격
	String people; //탑승 제원
	
	Bus() {
		System.out.println("나는 Bus의 생성자입니다.");
	}
	
	void print() {
		System.out.println("ho");
	}
}

public class BusMain {

	public static void main(String[] args) {

		Bus b = new Bus();
		
		Scanner sc = new Scanner(System.in);

		Bus[] cArr = new Bus[2];
		for(int i = 0; i<cArr.length; i++) {
			cArr[i] = new Bus();
			System.out.println("버    스" + (i+1));
			System.out.print("차종 입력 : ");
			cArr[i].name = sc.nextLine();
			System.out.print("제작 회사 입력 : ");
			cArr[i].company = sc.nextLine();
			System.out.print("견적 입력 : ");
			cArr[i].price = sc.nextLine();
			System.out.print("탑승 제원 입력 : ");
			cArr[i].people = sc.nextLine();
			System.out.println("-------------------------");
		}
/*
		cArr[0].name = "UniCity";
		cArr[0].price = 120000;

		cArr[1].name = "Universe Noble";
		cArr[1].price = 210000;
*/
		for (int i = 0; i < cArr.length; i++) {
			System.out.println("버     스 " + (i+1));
			System.out.println("차     종 : " + cArr[i].name);
			System.out.println("제작 회사 : " + cArr[i].company);
			System.out.println("견     적 : " + cArr[i].price);
			System.out.println("탑승 제원 : " + cArr[i].people);
			System.out.println("=========================");
		}
	}
}
