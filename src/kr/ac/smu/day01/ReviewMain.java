package kr.ac.smu.day01;

public class ReviewMain {

	public static void main(String[] args) {
		
		int age = 12;
		int num = 123;
		char unicode = '\u0042';
		boolean bool = true;
		
		System.out.printf("���� %d���Դϴ�.\n", age);
		System.out.printf("�ش� �����ڵ�� %c�Դϴ�.\n", unicode);
		System.out.println();
		System.out.printf("[%d]\n", num);
		System.out.printf("[%5d]\n", num);
		System.out.printf("[%05d]\n", num);
		System.out.printf("[%-5d]\n", num);
		System.out.printf("[%+5d]\n", num);
		
		System.out.printf("�ش� �� ���� %b\n", 4 + 3 > 7);
		System.out.println(3 + "+" + 4 + "=" + (3 + 4));
		
	}
}
