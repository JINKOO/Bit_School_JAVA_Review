package kr.ac.smu.day01;

public class ReviewMain {

	public static void main(String[] args) {
		
		int age = 12;
		int num = 123;
		char unicode = '\u0042';
		boolean bool = true;
		
		System.out.printf("나는 %d살입니다.\n", age);
		System.out.printf("해당 유니코드는 %c입니다.\n", unicode);
		System.out.println();
		System.out.printf("[%d]\n", num);
		System.out.printf("[%5d]\n", num);
		System.out.printf("[%05d]\n", num);
		System.out.printf("[%-5d]\n", num);
		System.out.printf("[%+5d]\n", num);
		
		System.out.printf("해당 논리 값은 %b\n", 4 + 3 > 7);
		System.out.println(3 + "+" + 4 + "=" + (3 + 4));
		
	}
}
