package kr.ac.smu.day14.Homework_1;

public class Thread03_2 extends Parent implements Runnable {
	
	public Thread03_2(Account ac) {
		super(ac);
	}
	
	@Override
	public void run() {
		getAccount().sub(scanInt());
	}
}
