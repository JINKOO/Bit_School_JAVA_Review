package kr.ac.smu.day03;

import java.util.Random;

/*
 * 정수 3개를 입력받아 큰 수에서 작은 수 순으로 출력하는 코드
 * 
 * 정수 3개를 입력 : 4 18 1
 * 출력 18 4 1
 */

public class SmallToLarge {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num1, num2, num3;
		int max, min;
		
		num1 = r.nextInt(50) + 1;
		num2 = r.nextInt(50) + 1;
		num3 = r.nextInt(50) + 1;
		
		System.out.println("추출된 정수 : " + num1 + ", " + num2 + ", " + num3);
		//우선 여기서 먼저 임의로 2개값을 max min으로 정해
		if(num1 > num2) {
			max = num1;
			min = num2;
		}
		
		else {
			max = num2;
			min = num1;
		}
		
		//num3의 위치를 파악하기.
		System.out.println("크기가 큰 것부터 정렬");
		if(num3 > max) { //num3이 max보다 크니까 가장 크다.
			System.out.printf("%d > %d > %d\n", num3, max, min);
		} else if(num3 > min) { //num3<max  --> num3이 max와 min사이에 있음
			System.out.printf("%d > %d > %d\n", max, num3, min);
		} else { //num3이 min보다 작음
			System.out.printf("%d > %d > %d\n", max, min, num3);
		}
			
	}
}
