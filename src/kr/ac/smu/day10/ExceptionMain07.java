package kr.ac.smu.day10;

import java.util.Random;

/*
 * throw 키워드 
 * 
 * 사용자 정의 예외 처리.
 * JVM은 예외로 인식하지 않고 정상적인 코드로 인식하지만
 * 사용자가 강제로 예외처리 하고 싶음.
 * 단, 무조건 Exception class를 상속받아야한다.
 * 
 * 
 * 사용자가 정의한 예외처리 class를 만들수 있다. 단, Exception class를 상속받아야.
 */

public class ExceptionMain07 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		
		try {
			int random = r.nextInt(10) + 1;
			System.out.println("추출한 난수 : " + random);
			
			if(random >= 5) {
				throw new Exception("5보다 큰 정수입니다.");
			}
			
		} catch(Exception e) {
			System.out.println("예외 발생!!");
			e.printStackTrace();
		}
		
		System.out.println("main end...");
	}
}
