package kr.ac.smu.day03;

import java.util.Random;

/*
 * ���� 3���� �Է¹޾� ū ������ ���� �� ������ ����ϴ� �ڵ�
 * 
 * ���� 3���� �Է� : 4 18 1
 * ��� 18 4 1
 */

public class SmallToLarge {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num1, num2, num3;
		int max, min;
		
		num1 = r.nextInt(50) + 1;
		num2 = r.nextInt(50) + 1;
		num3 = r.nextInt(50) + 1;
		
		System.out.println("����� ���� : " + num1 + ", " + num2 + ", " + num3);
		//�켱 ���⼭ ���� ���Ƿ� 2������ max min���� ����
		if(num1 > num2) {
			max = num1;
			min = num2;
		}
		
		else {
			max = num2;
			min = num1;
		}
		
		//num3�� ��ġ�� �ľ��ϱ�.
		System.out.println("ũ�Ⱑ ū �ͺ��� ����");
		if(num3 > max) { //num3�� max���� ũ�ϱ� ���� ũ��.
			System.out.printf("%d > %d > %d\n", num3, max, min);
		} else if(num3 > min) { //num3<max  --> num3�� max�� min���̿� ����
			System.out.printf("%d > %d > %d\n", max, num3, min);
		} else { //num3�� min���� ����
			System.out.printf("%d > %d > %d\n", max, min, num3);
		}
			
	}
}
