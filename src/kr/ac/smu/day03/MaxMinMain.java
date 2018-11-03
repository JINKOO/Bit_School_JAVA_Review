package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * 정수 4개를 입력받아 가장 큰 수를 출력하는 코드 작성
 * 
 * 정수 4개를 입력 : 23 8 16 9
 * 가장 큰 수 :23
 */
public class MaxMinMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		int max,min;
		
		System.out.print("정수 4개 입력: ");
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
		
		System.out.printf("%d %d %d %d 중 가장 작은 수는 %d입니다.\n", num1, num2, num3, num4, min);
	}
}
