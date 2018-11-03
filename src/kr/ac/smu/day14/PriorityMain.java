package kr.ac.smu.day14;

/*
 * 
 * thread�� �켱���� ���� ������.
 * ���ٸ� �켱���� ������ ���ٸ� �켱������ 5�̴�.
 * �켱������ 1-10���� �̸�
 * �켱������ 10�� ���� ����.
 * 
 * �� �켱������ ���ٰ� ������ ���� �Ǵ� ���� �ƴ϶�
 * ����� Ȯ���� ������ ���̴�.
 * 
 */
class PriorityThread extends Thread {
	
	public PriorityThread(String name) {
		super(name);
	}
	
	public void run() {
		
		for(int i = 1; i<=100; i++) {
			System.out.println("�켱����" + getPriority() + "�� thread : " + i + "��° ȣ��");
		}
	}
}

public class PriorityMain {

	public static void main(String[] args) {
		
		PriorityThread t1 = new PriorityThread("�켱������ 1�� Thread");
		PriorityThread t2 = new PriorityThread("�켱������ 5�� Thread");
		PriorityThread t3 = new PriorityThread("�켱������ 10�� Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
