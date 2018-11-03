package kr.ac.smu.day14.Homework_1;

public class ThreadManager {
	
	public void manage() {
		
		Account ac = new Account("홍길동", 10000);
		Parent p = new Parent(ac);
		
		Thread01 it = new Thread01(ac); //홍길동 입금
		Thread t1 = new Thread(it);
		
		Thread01_2 it2 = new Thread01_2(ac); //출금
		Thread t2 = new Thread(it2);
		
		Thread02 it3 = new Thread02(ac); //어머님 입금
		Thread t3 = new Thread(it3);
		
		Thread02_2 it4 = new Thread02_2(ac);//출금
		Thread t4 = new Thread(it4);
		
		Thread03 it5 = new Thread03(ac); //아버지 입금
		Thread t5 = new Thread(it5);
		
		Thread03_2 it6 = new Thread03_2(ac);//출금
		Thread t6 = new Thread(it6);
		
		
		t1.setName("홍길동");
		t2.setName("홍길동");
		t3.setName("어머니");
		t4.setName("어머니");
		t5.setName("아버지");
		t6.setName("아버지");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
