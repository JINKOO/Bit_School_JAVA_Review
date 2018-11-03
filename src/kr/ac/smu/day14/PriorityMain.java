package kr.ac.smu.day14;

/*
 * 
 * thread는 우선순위 값을 가진다.
 * 별다른 우선순위 지정이 없다면 우선순위는 5이다.
 * 우선순위는 1-10까지 이며
 * 우선순위는 10일 수록 높다.
 * 
 * 단 우선순위가 높다고 무조건 실행 되는 것이 아니라
 * 실행될 확률이 높아질 뿐이다.
 * 
 */
class PriorityThread extends Thread {
	
	public PriorityThread(String name) {
		super(name);
	}
	
	public void run() {
		
		for(int i = 1; i<=100; i++) {
			System.out.println("우선순위" + getPriority() + "인 thread : " + i + "번째 호출");
		}
	}
}

public class PriorityMain {

	public static void main(String[] args) {
		
		PriorityThread t1 = new PriorityThread("우선순위가 1인 Thread");
		PriorityThread t2 = new PriorityThread("우선순위가 5인 Thread");
		PriorityThread t3 = new PriorityThread("우선순위가 10인 Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
