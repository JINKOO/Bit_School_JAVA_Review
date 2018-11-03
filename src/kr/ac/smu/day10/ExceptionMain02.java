package kr.ac.smu.day10;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println("main start...");

		Random r = new Random();
		int num = r.nextInt(2);

		System.out.println("추출된 정수 : " + num);

		try {
			System.out.println(10 / num);
		} catch (ArithmeticException ae) {
			System.out.println("예외 발생!!!");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} finally {
			System.out.println("main end...");
		}
	}
}
