package kr.ac.smu.day02;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�: ");
		int num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		//sc.nextLine();
		
		System.out.println("�Ǽ� �ϳ� �Է�: ");
		float num2 = sc.nextFloat();
		System.out.println("num2 : " + num2);
		//sc.nextLine();
		
		System.out.println("�Ǽ� �ϳ� �Է�: ");
		double num3 = sc.nextDouble();
		System.out.println("num3 : " + num3);
		//sc.nextLine();
		
		System.out.println("���� �ϳ� �Է�: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.println("���ڿ� �ϳ� �Է�: ");
		String str = sc.next();
		System.out.println("str : " + str);
		
		System.out.println("�Ҹ��� �ϳ� �Է� : " );
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
	}
}
