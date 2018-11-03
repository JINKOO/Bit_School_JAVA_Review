package kr.ac.smu.day14.Homework_1;

import java.util.Scanner;

public class Account {

	private Scanner sc;
	private String name;
	private Parent p;
	private int total;
	private int money;
	

	public Account(String name, int total) {
		this.name = name;
		this.total = total;
		this.sc = new Scanner(System.in);
		this.p = new Parent();
		System.out.println(name + "님의 계좌 가 생성 되었습니다.");
		System.out.println("현재 잔액은 " + total + "원 입니다.");
		System.out.println("=====================================");
	}

//	public synchronized int scanMoney() {
//		System.out.print("입금or출금 금액을 입력 하세요: ");
//		int scanMoney = Integer.parseInt(sc.nextLine());
//		return scanMoney;
//	}
	
	public synchronized void add(int money) {
		total = total + money;
		System.out.println(Thread.currentThread().getName() + "님이 " + money + "원을 입금하였습니다.");
		try {
			System.out.println("입금 중입니다. 잠시만 기다려 주세요...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("현재 잔액은 " + total + "원 입니다.");
		System.out.println();
	}

	public synchronized void sub(int money) {
		total = total - money;
		if (total >= 0) {
			System.out.println(Thread.currentThread().getName() + "님이 " + money + "원을 출금하였습니다.");
			try {
				System.out.println("출금 중입니다. 잠시만 기다려 주세요");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("현재 잔액은  " + total + "원 입니다.");
		} else {
			System.out.println(Thread.currentThread().getName() + "님이 " + money + "원을 출금하였습니다.");
			System.out.println("잔액 부족 입니다. 출금 하실 수 없습니다.");
			total = total + money;
		}
		System.out.println();
	}
}
