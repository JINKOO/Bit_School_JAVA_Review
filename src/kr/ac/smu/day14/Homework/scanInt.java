package kr.ac.smu.day14.Homework;

import java.util.Scanner;

public class scanInt {

	private Scanner sc;
	
	public scanInt() {
		sc = new Scanner(System.in);
	}
	
	//�Ա� �ݾ�.
	public int put() {
		int put = Integer.parseInt(sc.nextLine());
		return put;
	}
	
	//��� �ݾ�.
	public int get() {
		int get = Integer.parseInt(sc.nextLine());
		return get;
	}
}
