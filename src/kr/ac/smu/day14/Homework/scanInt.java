package kr.ac.smu.day14.Homework;

import java.util.Scanner;

public class scanInt {

	private Scanner sc;
	
	public scanInt() {
		sc = new Scanner(System.in);
	}
	
	//입금 금액.
	public int put() {
		int put = Integer.parseInt(sc.nextLine());
		return put;
	}
	
	//출금 금액.
	public int get() {
		int get = Integer.parseInt(sc.nextLine());
		return get;
	}
}
