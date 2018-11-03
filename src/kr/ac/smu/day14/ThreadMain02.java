package kr.ac.smu.day14;

/*
 * 서로 다른 기능을 하는 Thread2개 생성.
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
			System.out.println("고진권" + i);
		}
	}
	
	
}

public class ThreadMain02 {

	public static void main(String[] args) {

		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		ImpleThread it = new ImpleThread();
		Thread ite = new Thread(it); //Runnable 에는 start()가없다. 
				

		t1.start();
		t2.start();
		ite.start();
		
		/*
		 * 실행 결과
		 * t1, t2 쓰래드 생성되고
		 * t1이 실행하는데 중간에 t2가 실행 될 수있다.
		 * 
		 */
	}
}
