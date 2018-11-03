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
		System.out.println(name + "���� ���� �� ���� �Ǿ����ϴ�.");
		System.out.println("���� �ܾ��� " + total + "�� �Դϴ�.");
		System.out.println("=====================================");
	}

//	public synchronized int scanMoney() {
//		System.out.print("�Ա�or��� �ݾ��� �Է� �ϼ���: ");
//		int scanMoney = Integer.parseInt(sc.nextLine());
//		return scanMoney;
//	}
	
	public synchronized void add(int money) {
		total = total + money;
		System.out.println(Thread.currentThread().getName() + "���� " + money + "���� �Ա��Ͽ����ϴ�.");
		try {
			System.out.println("�Ա� ���Դϴ�. ��ø� ��ٷ� �ּ���...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� �ܾ��� " + total + "�� �Դϴ�.");
		System.out.println();
	}

	public synchronized void sub(int money) {
		total = total - money;
		if (total >= 0) {
			System.out.println(Thread.currentThread().getName() + "���� " + money + "���� ����Ͽ����ϴ�.");
			try {
				System.out.println("��� ���Դϴ�. ��ø� ��ٷ� �ּ���");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("���� �ܾ���  " + total + "�� �Դϴ�.");
		} else {
			System.out.println(Thread.currentThread().getName() + "���� " + money + "���� ����Ͽ����ϴ�.");
			System.out.println("�ܾ� ���� �Դϴ�. ��� �Ͻ� �� �����ϴ�.");
			total = total + money;
		}
		System.out.println();
	}
}
