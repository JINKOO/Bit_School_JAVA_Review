package kr.ac.smu.day14.Homework_1;

public class ThreadManager {
	
	public void manage() {
		
		Account ac = new Account("ȫ�浿", 10000);
		Parent p = new Parent(ac);
		
		Thread01 it = new Thread01(ac); //ȫ�浿 �Ա�
		Thread t1 = new Thread(it);
		
		Thread01_2 it2 = new Thread01_2(ac); //���
		Thread t2 = new Thread(it2);
		
		Thread02 it3 = new Thread02(ac); //��Ӵ� �Ա�
		Thread t3 = new Thread(it3);
		
		Thread02_2 it4 = new Thread02_2(ac);//���
		Thread t4 = new Thread(it4);
		
		Thread03 it5 = new Thread03(ac); //�ƹ��� �Ա�
		Thread t5 = new Thread(it5);
		
		Thread03_2 it6 = new Thread03_2(ac);//���
		Thread t6 = new Thread(it6);
		
		
		t1.setName("ȫ�浿");
		t2.setName("ȫ�浿");
		t3.setName("��Ӵ�");
		t4.setName("��Ӵ�");
		t5.setName("�ƹ���");
		t6.setName("�ƹ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
