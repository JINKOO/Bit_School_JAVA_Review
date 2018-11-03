package kr.ac.smu.day14.Homework;

import java.util.Scanner;

/*
 * 
 * 계좌 공유 data.
 * 
 */
public class AccountData {

	private int totalMoney;
	private int money;
	private Scanner sc;
	
	
	public AccountData(int totalMoney) {
		super();
		this.totalMoney = totalMoney;
		this.sc = new Scanner(System.in);
		this.money = Integer.parseInt(sc.nextLine()); 
	}
	
	//입금
	public synchronized void add(String name) {
		System.out.println(name + "이 " + money + "을 입금하셨습니다.");
		totalMoney = totalMoney + money;
		System.out.println("잔액은 " + totalMoney + "입니다.");
		try {
			notifyAll();
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//출금
	public synchronized void sub(String name) {
		System.out.println(name + "이 " + money + "을 출금하셨습니다.");
		totalMoney = totalMoney - money;
		System.out.println("잔액은 " + totalMoney + "입니다.");
		try {
			notifyAll();
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
