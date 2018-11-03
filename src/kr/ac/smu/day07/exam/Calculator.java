package kr.ac.smu.day07.exam;

import java.util.Scanner;

public class Calculator {

	public int getNum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	public void add(int num1, int num2) {
		
		int result = num1 + num2;
		System.out.print(num1 + " + " + num2 + " = " +  result);
	}
	
	public void subtract(int num1, int num2) {
		
	}
	
	public void multiple(int num1, int num2) {
		
	}
	
	public void divide(int num1, int num2) {
		
	}
}
