package kr.ac.smu.day04;

import java.util.Random;

/*
 * 배열 하나 선언
 * 정수형 5개를 입력받거나 랜덤함수로 하거나 해서 초기화 후
 * 
 * 짝수는 짝수끼리 홀수는 홀수끼리 출력
 */

public class ReviewMain01 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int count = 0;
		int sum = 0;
		Random r = new Random();
		
		System.out.println("==배열 초기화==");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("==짝수만 출력==");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] %2 == 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
				count++;
			} 
		}
		System.out.println();
		System.out.println("총 개수 : " + count);
		System.out.println("총 합 : " + sum);
		
		count = 0;
		sum = 0;
		System.out.println("==홀수만 출력==");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
				count++;
			}
		}
		System.out.println();
		System.out.println("총 개수 : " + count);
		System.out.println("총 합 : " + sum);
	}
}
