package kr.ac.smu.day07.exam;

import java.util.Scanner;

/*
 *  입력 스트링 : String strData = "Hello World Java";
 *  
 *  a. ch = 'o'인 경우 => 2리턴
 *  b. ch = 'W'인 경우 => 1리턴
 *  
 */
public class HomeWorkMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 스트링 : ");
		String strData = new String(sc.nextLine());
		
		System.out.print("ch = ");
		char ch = sc.nextLine().charAt(0);
		
		int count = Homework03.checkChar(strData, ch);
		System.out.println("\'" + ch + "\'" + "의 개수 : " + count);
		
	}
}
