package kr.ac.smu.day07.exam;

import java.util.Scanner;

/*
 * �־��� ���ڿ����� �Է¹��� ���ڸ� ����.
 * 
 * ���ڿ�(oriStr)�� ���� �� �־��� ����(delChar)�� �����Ѵ�.
 * ������ �������� ���ڿ��� ������ �����Ѵ�.
 * 
 */
public class Homeworkmain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String oriStr : ");
		String oriStr = sc.nextLine();
		System.out.print("delChar : " );
		char delChar = sc.nextLine().charAt(0);

		String delStr = Homework04.removeChar(oriStr, delChar);
		System.out.print("delStr : " + delStr);
		
	}
}
