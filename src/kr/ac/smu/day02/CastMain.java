package kr.ac.smu.day02;

public class CastMain {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 53;
		
		double num3 = 12 + 12.5; //int  + double => double
		double num4 = 12.5 / 2; //double / int => double
		double average1 = (double)(num1 + num2) / 2;
		double average2 = ((double)num1 + num2) / 2;
		double average3 = (num1 + num2) /2.;
		int avg = (int)12.34;
		
		System.out.println(num4);
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
		System.out.println(avg);
		
	}
}
