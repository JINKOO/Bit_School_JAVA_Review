package kr.ac.smu.day14.Homework_1;

import java.util.Scanner;

public class Parent {

	private Account ac;
	private Scanner sc;
	
	public Parent() {
		
	}

	public Parent(Account ac) {
		super();
		this.ac = ac;
		this.sc = new Scanner(System.in);
	}
	
	public Account getAccount() {
		return ac;
	}
	
	public int scanInt() {
		System.out.println("�Ա� or ��� �ݾ��� �Է� �ϼ���");
		int money = Integer.parseInt(sc.nextLine());
		return money;
	}	
}
