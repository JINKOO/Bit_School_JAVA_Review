package kr.ac.smu.day14.Homework_1;

public class Thread03 extends Parent implements Runnable {
	
	public Thread03(Account ac) {
		super(ac);
	}

	@Override
	public void run() {
		getAccount().add(scanInt());
	}
}
