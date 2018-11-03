package kr.ac.smu.day07.exam;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		StringUtil s = new StringUtil();
		
		System.out.println("#1. isUpperChar()");
		System.out.print("하나의 문자 : ");
		//char ch = s.getChar();
		char ch = sc.nextLine().charAt(0);
		boolean bool = s.isUpperChar(ch);
		System.out.println("result : " + bool);
		
		s.printDivide();
		
		System.out.println("#2. isLowerChar()");
		System.out.print("하나의 문자 : ");
		//ch = s.getChar();
		ch = sc.nextLine().charAt(0);
		bool = s.isLowerChar(ch);
		System.out.println("result : " + bool);
		
		s.printDivide();
		
		System.out.println("#3. max()");
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		int result = s.max(num1, num2);
		System.out.println("max = " + result);
		
		s.printDivide();
		
		System.out.println("#4. min()");
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		result = s.min(num1, num2);
		System.out.println("min = " + result);
		
		s.printDivide();
		
		System.out.println("#5. reverseString()");
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] cArr = s.reverseString(str);
		s.showArr(cArr);
		System.out.println();
		
		s.printDivide();
		
		System.out.println("#6. toUpperString()");
		System.out.print("문자열 : ");
		str = sc.nextLine();
		cArr = s.toUpperString(str);
		s.showArr(cArr);
		System.out.println();
	
		s.printDivide();
		
		System.out.println("#7. toLowerString()"); 
		System.out.print("문자열 : ");
		str = sc.nextLine();
		String cArr3 = s.toLowerString(str);
		s.showArr(cArr);
		System.out.println();
	}
}
