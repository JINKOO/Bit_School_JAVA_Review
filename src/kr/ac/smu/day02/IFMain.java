package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * 기상한다.
 * 출발시간이 8시 이전이면 걸어서
 *        8시~8시15분 사이면 버스타고
 *        8시15분이후라면 택시타고
 * 학교간다.
 * 
 */

public class IFMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("기상한다.");
		
		double time;
		System.out.println("출발 시각을 입력하세요 (8시이면 8.00) : ");
		time = sc.nextDouble();
		sc.nextLine();
		
				
		if(time < 8.00) { //조건문 1
			
			System.out.println("걸어간다.");
		
		}else { //8시 이후
			//중첩 if문 조건문 1이 거짓인것들 중 다시 조건을 나눈다.
			
			if(time < 8.15) { //굳이 조건을 time>8.00 && time <=8.15안해도 된다. 어찌됫든 조건문 1을 만족하지 않는 상태이므로
				System.out.println("버스타고 간다.");
			}
			else {//8시 이후이면서 8시15분 이후 (조건문 1이 거짓이고 조건문 2도 거짓)
				System.out.println("택시타고 간다.");
			}
			
		}
		System.out.println("학교간다.");
	}
}
