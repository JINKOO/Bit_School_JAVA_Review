package kr.ac.smu.day05;

import java.util.Scanner;

class Bus {

	String name; // �� �̸�
	String company;//���� ���� ȸ��
	String price; // �� ����
	String people; //ž�� ����
	
	Bus() {
		System.out.println("���� Bus�� �������Դϴ�.");
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
			System.out.println("��    ��" + (i+1));
			System.out.print("���� �Է� : ");
			cArr[i].name = sc.nextLine();
			System.out.print("���� ȸ�� �Է� : ");
			cArr[i].company = sc.nextLine();
			System.out.print("���� �Է� : ");
			cArr[i].price = sc.nextLine();
			System.out.print("ž�� ���� �Է� : ");
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
			System.out.println("��     �� " + (i+1));
			System.out.println("��     �� : " + cArr[i].name);
			System.out.println("���� ȸ�� : " + cArr[i].company);
			System.out.println("��     �� : " + cArr[i].price);
			System.out.println("ž�� ���� : " + cArr[i].people);
			System.out.println("=========================");
		}
	}
}
