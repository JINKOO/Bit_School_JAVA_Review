package kr.ac.smu.day04;

import java.util.Random;

/*
 * �迭 �ϳ� ����
 * ������ 5���� �Է¹ްų� �����Լ��� �ϰų� �ؼ� �ʱ�ȭ ��
 * 
 * ¦���� ¦������ Ȧ���� Ȧ������ ���
 */

public class ReviewMain01 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int count = 0;
		int sum = 0;
		Random r = new Random();
		
		System.out.println("==�迭 �ʱ�ȭ==");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("==¦���� ���==");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] %2 == 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
				count++;
			} 
		}
		System.out.println();
		System.out.println("�� ���� : " + count);
		System.out.println("�� �� : " + sum);
		
		count = 0;
		sum = 0;
		System.out.println("==Ȧ���� ���==");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
				count++;
			}
		}
		System.out.println();
		System.out.println("�� ���� : " + count);
		System.out.println("�� �� : " + sum);
	}
}
