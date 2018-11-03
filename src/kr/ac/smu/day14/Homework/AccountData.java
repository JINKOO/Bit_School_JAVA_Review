package kr.ac.smu.day14.Homework;

import java.util.Scanner;

/*
 * 
 * ���� ���� data.
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
	
	//�Ա�
	public synchronized void add(String name) {
		System.out.println(name + "�� " + money + "�� �Ա��ϼ̽��ϴ�.");
		totalMoney = totalMoney + money;
		System.out.println("�ܾ��� " + totalMoney + "�Դϴ�.");
		try {
			notifyAll();
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//���
	public synchronized void sub(String name) {
		System.out.println(name + "�� " + money + "�� ����ϼ̽��ϴ�.");
		totalMoney = totalMoney - money;
		System.out.println("�ܾ��� " + totalMoney + "�Դϴ�.");
		try {
			notifyAll();
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
