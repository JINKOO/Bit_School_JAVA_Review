package kr.ac.smu.day14.Homework;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("Go");
		
		AccountData data = new AccountData(10_000);
		
		GenerateThread t1 = new GenerateThread(data, "ȫ�浿");
		GenerateThread t2 = new GenerateThread(data, "��Ӵ�");
		GenerateThread t3 = new GenerateThread(data, "�ƹ���");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
