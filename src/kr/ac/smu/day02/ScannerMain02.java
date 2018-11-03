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
		
		System.out.println("ch 입력: ");
		ch = sc.nextLine().charAt(0);
		
		System.out.println("num1 입력: ");
		num1 = sc.nextInt();
		sc.nextLine(); //buffer flush 버퍼를 비우는것.
		
		System.out.println("num2 입력: ");
		num2 = sc.nextInt();
		sc.nextLine(); //buffer에 남아있는 enter 지워줌
		
		System.out.println("문자열 하나 입력: ");
		str = sc.nextLine();
		
		System.out.println("ch : " + ch + ", num1 : " + num1 + ", num2 : " + num2);
		System.out.println("str : " + str);
	}
}
