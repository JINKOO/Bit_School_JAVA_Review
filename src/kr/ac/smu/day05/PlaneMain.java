package kr.ac.smu.day05;

import java.util.Scanner;

public class PlaneMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Plane[] pArr = new Plane[2];
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i] = new Plane();
			System.out.println(i+1);
			System.out.print("제작 회사 입력 : ");
			pArr[i].company = sc.next();
			System.out.print("기종 입력 : ");
			pArr[i].name = sc.next();
		}
		
		System.out.println("<<PRINT>>");
		for(int i = 0; i<pArr.length; i++) {
			System.out.println("제작 회사 : " + pArr[i].company);
			System.out.println("기     종 : " + pArr[i].name);
			System.out.println("==========================");
		}
	}
}
