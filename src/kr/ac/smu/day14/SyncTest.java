package kr.ac.smu.day14;

class KO {
	
	private int sum;
	
	public KO() {
		this.sum = 0;
	}
	
	public synchronized void printA() {
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1-10까지의 합은  : " + sum);
	}
}

class MakeThread extends Thread {
	
	private KO ko;
	private int type;
	
	public MakeThread(KO ko, int type) {
		
		this.ko = ko;
		this.type = type;
	}
	
	public void run() {
		
		ko.printA();
	}
}

public class SyncTest {

	public static void main(String[] args) {
		
		
		KO ko = new KO();
		
		MakeThread t1 = new MakeThread(ko,1);
		MakeThread t2 = new MakeThread(ko,2);
		
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();		
	}
}
