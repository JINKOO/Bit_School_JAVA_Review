package kr.ac.smu.day04;

import java.util.Random;

/*
 *  1 - 99������ ������ 5�� �����Ͽ� ������ ���� ���

  < PRINT >
  25  9  36  84  70
  
  < REVERSE >
  7  48  63  90  52
 */

public class HomeWork01 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[5];

		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*99) + 1);
		}
				
		System.out.println("< PRINT >");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[(arr.length - 1) -i] + " ");
		}
		System.out.println();
	}
}
