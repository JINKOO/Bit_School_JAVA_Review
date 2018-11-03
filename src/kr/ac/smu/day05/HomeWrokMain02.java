package kr.ac.smu.day05;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  5���� ������ �Է¹޾� ����ϴ� �ڵ带 �ۼ�(��, ������ ��Ģ�� �����Ͽ� �ۼ�)

	1��° ���� �Է� : 5
	2��° ���� �Է� : 17
	3��° ���� �Է� : 8
		���� �Է��� 5, 17���� Ŀ���մϴ�
	3��° ���� �Է� : 19
	4��° ���� �Է� : 25
	5��° ���� �Է� : 9
		���� �Է��� 5, 17, 19, 25���� Ŀ���մϴ�
	5��° ���� �Է� : 20
		���� �Է��� 5, 17, 19, 25���� Ŀ���մϴ�
	5��° ���� �Է� : 32
	
	<5���� ���� ���>
	5  17  19  25  32
	
 */

public class HomeWrokMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int i = 0;
		while(i < arr.length) {  //for������ ������ �Ƚᵵ �ȴ�.
			System.out.print(i+1 + "��° ���� �Է� : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
			if( i != 0 && arr[i] <= arr[i-1]) {
				System.out.print("\t���� �Է��� ");
				for(int j = 0; j<i; j++) {
					System.out.print(arr[j]);
					if(j != i-1)
						System.out.print(", ");
				}
				System.out.print("���� Ŀ�� �մϴ�.");
				System.out.println();
			} else {
				i++;
			}
		}
		System.out.println();
		
		System.out.println("<���ĵ� 5�� ���� ���>");
		String str = new String(Arrays.toString(arr));
		System.out.println(str);
	}
}
