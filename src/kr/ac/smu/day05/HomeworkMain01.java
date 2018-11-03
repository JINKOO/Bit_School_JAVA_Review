package kr.ac.smu.day05;

import java.util.Random;

/*
 * 5개의 정수를 랜덤하게 입력받음(1-99)
 * 
 * <PRINT>
 * 5 25 60 12 3
 * 
 * <REVERSE>
 * 30 21 6 52 50
 * 
 */
public class HomeworkMain01 {

	static void ShowArray(int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		Random r = new Random();

		int[] arr = new int[5];
		//int[] arr2 = new int[5];
		
		System.out.println("==배열 초기화==");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(99) + 1;
		}

		System.out.println("<PRINT>");
		ShowArray(arr);
		System.out.println();

		System.out.println("<REVERSE>");
		for(int i = arr.length - 1; i >= 0; i--) {
			int n10 = arr[i] / 10;
			int n1 = arr[i] % 10;
			arr[(arr.length - 1)-i] = (n1 * 10) + n10;
		}
		ShowArray(arr);
	}

}
