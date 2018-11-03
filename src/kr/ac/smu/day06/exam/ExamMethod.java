package kr.ac.smu.day06.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamMethod {
	/**
	 * 한 정 수를 입력받아 리턴해주는 함수.
	 * 
	 * @return 입력 받은 정수.
	 * 
	 */
	public int getNum() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	/**
	 * 두 개의 정수를 받아와서 합을 출력하는 함수.
	 * 
	 * @param num1
	 * @param num2
	 */
	public void printSum(int num1, int num2) {

		int total = 0;
		for (int i = num1; i <= num2; i++) {
			total = total + i;
		}
		System.out.printf("%d ~ %d 총 합 : %d\n", num1, num2, total);
	}

	public int[] getArray() {

		int[] arr = this.getArray(100, 10);
		return arr;
	}

	public int[] getArray(int size) {

		int[] arr = getArray(100, size);
		return arr;
	}
	
	public int[] getArray(int max, int size) {

		Random r = new Random();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(max) + 1;
		}
		return arr;
	}

	public void showArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
