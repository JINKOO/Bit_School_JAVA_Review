package kr.ac.smu.day07.exam;

import java.util.Scanner;

/*
 *  �Է� ��Ʈ�� : String strData = "Hello World Java";
 *  
 *  a. ch = 'o'�� ��� => 2����
 *  b. ch = 'W'�� ��� => 1����
 *  
 */
public class HomeWorkMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� ��Ʈ�� : ");
		String strData = new String(sc.nextLine());
		
		System.out.print("ch = ");
		char ch = sc.nextLine().charAt(0);
		
		int count = Homework03.checkChar(strData, ch);
		System.out.println("\'" + ch + "\'" + "�� ���� : " + count);
		
	}
}
