package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * next()
 * nextLine()
 * 
 */
public class ScannerMain02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		char ch;
		String str;
		
		System.out.println("ch �Է�: ");
		ch = sc.nextLine().charAt(0);
		
		System.out.println("num1 �Է�: ");
		num1 = sc.nextInt();
		sc.nextLine(); //buffer flush ���۸� ���°�.
		
		System.out.println("num2 �Է�: ");
		num2 = sc.nextInt();
		sc.nextLine(); //buffer�� �����ִ� enter ������
		
		System.out.println("���ڿ� �ϳ� �Է�: ");
		str = sc.nextLine();
		
		System.out.println("ch : " + ch + ", num1 : " + num1 + ", num2 : " + num2);
		System.out.println("str : " + str);
	}
}
