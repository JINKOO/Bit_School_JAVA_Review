package kr.ac.smu.day02;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
	
		Random r = new Random();
		
		int num1 = r.nextInt(10); //0-9������ ���� �� �ϳ��� ���
		int num2 = (int)(Math.random() * 10);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
