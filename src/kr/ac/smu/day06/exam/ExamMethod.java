package kr.ac.smu.day06.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamMethod {
	/**
	 * �� �� ���� �Է¹޾� �������ִ� �Լ�.
	 * 
	 * @return �Է� ���� ����.
	 * 
	 */
	public int getNum() {

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	/**
	 * �� ���� ������ �޾ƿͼ� ���� ����ϴ� �Լ�.
	 * 
	 * @param num1
	 * @param num2
	 */
	public void printSum(int num1, int num2) {

		int total = 0;
		for (int i = num1; i <= num2; i++) {
			total = total + i;
		}
		System.out.printf("%d ~ %d �� �� : %d\n", num1, num2, total);
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
