package kr.ac.smu.day14.Homework;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("Go");
		
		AccountData data = new AccountData(10_000);
		
		GenerateThread t1 = new GenerateThread(data, "홍길동");
		GenerateThread t2 = new GenerateThread(data, "어머니");
		GenerateThread t3 = new GenerateThread(data, "아버지");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
