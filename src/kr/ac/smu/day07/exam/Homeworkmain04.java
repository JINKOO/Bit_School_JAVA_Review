package kr.ac.smu.day07.exam;

import java.util.Scanner;

/*
 * 주어진 문자열에서 입력받은 문자를 삭제.
 * 
 * 문자열(oriStr)의 내용 중 주어진 문자(delChar)를 삭제한다.
 * 삭제된 내용으로 문자열의 내용을 변경한다.
 * 
 */
public class Homeworkmain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String oriStr : ");
		String oriStr = sc.nextLine();
		System.out.print("delChar : " );
		char delChar = sc.nextLine().charAt(0);

		String delStr = Homework04.removeChar(oriStr, delChar);
		System.out.print("delStr : " + delStr);
		
	}
}
