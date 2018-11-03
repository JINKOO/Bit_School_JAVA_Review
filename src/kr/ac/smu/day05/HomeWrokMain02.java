package kr.ac.smu.day05;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  5개의 정수를 입력받아 출력하는 코드를 작성(단, 다음의 규칙을 적용하여 작성)

	1번째 정수 입력 : 5
	2번째 정수 입력 : 17
	3번째 정수 입력 : 8
		정수 입력은 5, 17보다 커야합니다
	3번째 정수 입력 : 19
	4번째 정수 입력 : 25
	5번째 정수 입력 : 9
		정수 입력은 5, 17, 19, 25보다 커야합니다
	5번째 정수 입력 : 20
		정수 입력은 5, 17, 19, 25보다 커야합니다
	5번째 정수 입력 : 32
	
	<5개의 정수 출력>
	5  17  19  25  32
	
 */

public class HomeWrokMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int i = 0;
		while(i < arr.length) {  //for문에서 증감식 안써도 된다.
			System.out.print(i+1 + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
			if( i != 0 && arr[i] <= arr[i-1]) {
				System.out.print("\t정수 입력은 ");
				for(int j = 0; j<i; j++) {
					System.out.print(arr[j]);
					if(j != i-1)
						System.out.print(", ");
				}
				System.out.print("보다 커야 합니다.");
				System.out.println();
			} else {
				i++;
			}
		}
		System.out.println();
		
		System.out.println("<정렬된 5개 정수 출력>");
		String str = new String(Arrays.toString(arr));
		System.out.println(str);
	}
}
