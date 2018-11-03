package kr.ac.smu.day14.Homework_1;

public class Thread01 extends Parent implements Runnable {
	
	public Thread01(Account ac) {
		super(ac);
	}

	@Override
	public void run() {
		getAccount().add(scanInt());
	}
}
