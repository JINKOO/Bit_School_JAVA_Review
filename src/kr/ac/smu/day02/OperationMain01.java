package kr.ac.smu.day02;

import java.util.Scanner;

public class OperationMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("num1 : ");
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num2 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		
		//num2�� num1�� ������� �Ǵ�
		//�� num2�� 0�̵Ǹ� �ȵȴ�.
		
		System.out.println(num2 != 0 && num1 % num2 == 0);
		
		int a = -1;
		int b = 0;
		int c = 1;
		
		System.out.println(++a == 0 || ++b >= 0 && ++c == 0);
		//System.out.println(++a == 0 || ++b == 0 && ++c >= -1);
		System.out.println("a : " + a + ", b : " + b + ", c: " + c);
		
		
	}
}
