package kr.ac.smu.day10;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");

		for (int i = -2; i < 4; i++) {

			try {
				System.out.println(1 / i);
			} catch (ArithmeticException ae) {
				//ae.printStackTrace();
				System.out.println("���� �߻�.");
				break;
			} finally {
				System.out.println("�ݺ��� ������...");
				/*
				 * catch���� break���� �־
				 * finally�� ������ ������ finally ���� �����ϰ� break;
				 * �ַ� return�Ҷ��� �ݺ��� ����� ����.
				 */
			}
		}
		System.out.println("main end...");
	}
}
