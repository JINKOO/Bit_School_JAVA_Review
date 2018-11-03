package kr.ac.smu.day02;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
	
		Random r = new Random();
		
		int num1 = r.nextInt(10); //0-9까지의 숫자 중 하나를 출력
		int num2 = (int)(Math.random() * 10);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
