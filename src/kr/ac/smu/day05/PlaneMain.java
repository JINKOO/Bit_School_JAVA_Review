package kr.ac.smu.day05;

import java.util.Scanner;

public class PlaneMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Plane[] pArr = new Plane[2];
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i] = new Plane();
			System.out.println(i+1);
			System.out.print("���� ȸ�� �Է� : ");
			pArr[i].company = sc.next();
			System.out.print("���� �Է� : ");
			pArr[i].name = sc.next();
		}
		
		System.out.println("<<PRINT>>");
		for(int i = 0; i<pArr.length; i++) {
			System.out.println("���� ȸ�� : " + pArr[i].company);
			System.out.println("��     �� : " + pArr[i].name);
			System.out.println("==========================");
		}
	}
}
