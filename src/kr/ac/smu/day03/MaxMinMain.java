package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * ���� 4���� �Է¹޾� ���� ū ���� ����ϴ� �ڵ� �ۼ�
 * 
 * ���� 4���� �Է� : 23 8 16 9
 * ���� ū �� :23
 */
public class MaxMinMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		int max,min;
		
		System.out.print("���� 4�� �Է�: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		sc.nextLine();
		
		min = num1;
		
		if(min > num2) {
			min = num2;
		}
		
		if(min > num3) {
			min = num3;
		}
		
		if(min > num4) {
			min = num4;
		}
		
		System.out.printf("%d %d %d %d �� ���� ���� ���� %d�Դϴ�.\n", num1, num2, num3, num4, min);
	}
}
