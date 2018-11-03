package kr.ac.smu.day14;

import java.util.Date;

/*
 * Sleep() 
 * 
 * run상태인 thread를 block() 상태로 가고
 * 다른 thread가 run상태가 된다.
 * 
 * run인 상태에서 sleep()을 만나면 무조건 작업 권한을 잃고
 * sleep()에서 지정한 일정 시간 만큼 block상태가 된다.
 * 지정한 일정 시간이 지나면 다시 thread 큐로 온다. runnable상태가 된다.
 * 
 * sleep()은 try-catch문이 필요하다. 
 * 
 */



//Hi가 출려될때 10초에 한번씩 현재시간.
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
			System.out.println("현재 시간 : " + new Date().toLocaleString());
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
		
		System.out.println("main thread를 2초동안 잠재우기");
		
		/*
		 * t1 t2중 누가 먼저 실행되는 지는 JVM이 판단한다.
		 * 단, 코드 상 t1이 먼저 나오므로 먼저 나올 확률이 높을 뿐이다.
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
		
		System.out.println("main thread 깨어남");
		
		System.out.println("========================================");
		
		
	}
}
