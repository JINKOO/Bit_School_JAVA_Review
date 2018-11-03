package kr.ac.smu.day14;

/*
 * ���� �ٸ� ����� �ϴ� Thread2�� ����.
 * 
 */

class Thread01 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Go!!!");
		}
	}
}

class Thread02 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Stop");
		}
	}
}

class ImpleThread implements Runnable {

	@Override
	public void run() {
		
		for(int i = 1; i<=1000; i++) {
			System.out.println("������" + i);
		}
	}
	
	
}

public class ThreadMain02 {

	public static void main(String[] args) {

		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		ImpleThread it = new ImpleThread();
		Thread ite = new Thread(it); //Runnable ���� start()������. 
				

		t1.start();
		t2.start();
		ite.start();
		
		/*
		 * ���� ���
		 * t1, t2 ������ �����ǰ�
		 * t1�� �����ϴµ� �߰��� t2�� ���� �� ���ִ�.
		 * 
		 */
	}
}
