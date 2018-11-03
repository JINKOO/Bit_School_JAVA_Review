package kr.ac.smu.day14;

import java.util.Date;

/*
 * Sleep() 
 * 
 * run������ thread�� block() ���·� ����
 * �ٸ� thread�� run���°� �ȴ�.
 * 
 * run�� ���¿��� sleep()�� ������ ������ �۾� ������ �Ұ�
 * sleep()���� ������ ���� �ð� ��ŭ block���°� �ȴ�.
 * ������ ���� �ð��� ������ �ٽ� thread ť�� �´�. runnable���°� �ȴ�.
 * 
 * sleep()�� try-catch���� �ʿ��ϴ�. 
 * 
 */



//Hi�� ����ɶ� 10�ʿ� �ѹ��� ����ð�.
class Thread0 extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Hi~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ImpleThread02 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("���� �ð� : " + new Date().toLocaleString());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}

public class ThreadMain03 {

	public static void main(String[] args) {
		
		System.out.println("main thread�� 2�ʵ��� ������");
		
		/*
		 * t1 t2�� ���� ���� ����Ǵ� ���� JVM�� �Ǵ��Ѵ�.
		 * ��, �ڵ� �� t1�� ���� �����Ƿ� ���� ���� Ȯ���� ���� ���̴�.
		 */
		
		try { 
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread0 t1 = new Thread0();
		ImpleThread02 t = new ImpleThread02();
		Thread t2 =  new Thread(t);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread ���");
		
		System.out.println("========================================");
		
		
	}
}
