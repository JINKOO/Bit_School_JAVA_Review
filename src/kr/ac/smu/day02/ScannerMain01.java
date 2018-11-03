package kr.ac.smu.day02;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력: ");
		int num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		//sc.nextLine();
		
		System.out.println("실수 하나 입력: ");
		float num2 = sc.nextFloat();
		System.out.println("num2 : " + num2);
		//sc.nextLine();
		
		System.out.println("실수 하나 입력: ");
		double num3 = sc.nextDouble();
		System.out.println("num3 : " + num3);
		//sc.nextLine();
		
		System.out.println("문자 하나 입력: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.println("문자열 하나 입력: ");
		String str = sc.next();
		System.out.println("str : " + str);
		
		System.out.println("불린값 하나 입력 : " );
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
	}
}
