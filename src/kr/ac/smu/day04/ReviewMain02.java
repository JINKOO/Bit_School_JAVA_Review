package kr.ac.smu.day04;

import java.util.Random;

public class ReviewMain02 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		Random r = new Random();

		System.out.println("�迭 �ʱ�ȭ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(5) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		
		String[] title = {"¦��", "Ȧ��"};
		int sum[] = new int[2];
		int count = 0;
		for(int mode = 0; mode<title.length; mode++) { //¦���϶� ����ϰ� Ȧ�� �϶� ����Ѵ�.
			count = 0;
			System.out.println("<< " + title[mode] + " >>");
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] % 2 == mode) {
					System.out.print(arr[i] + " ");
					sum[mode] = sum[mode] + arr[i]; 
				}
			}
			System.out.println();
			System.out.println("�� ���� : " + count);
			System.out.println("�� �� : " + sum[mode]);
		}
	}
}
