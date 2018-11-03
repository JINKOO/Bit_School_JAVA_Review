package kr.ac.smu.day10;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");

		for (int i = -2; i < 4; i++) {

			try {
				System.out.println(1 / i);
			} catch (ArithmeticException ae) {
				//ae.printStackTrace();
				System.out.println("예외 발생.");
				break;
			} finally {
				System.out.println("반복문 수행중...");
				/*
				 * catch문에 break문이 있어도
				 * finally가 있으면 무조건 finally 먼저 수행하고 break;
				 * 주로 return할때나 반복문 수행시 쓴다.
				 */
			}
		}
		System.out.println("main end...");
	}
}
