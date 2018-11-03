package kr.ac.smu.day14;

class Sync {
	
	public synchronized void a() {
		for(int i = 1; i<=10; i++) {
			System.out.print("a");
		}
	}
	
	public void b() {
		for(int i = 1; i<=10; i++) {
			System.out.print("b");
		}
	}
	
	public void c() {
		for(int i = 1; i<=10; i++) {
			System.out.print("c");
		}
	}
}

class SyncThread extends Thread {
	
	private Sync sync; //공유 자원.
	private int type;
	
	public SyncThread(Sync sync, int type) {
		
		this.sync = sync;
		this.type = type;
	}
	
	@Override
	public void run() {
		
		switch(type) {
		
		case 1:
			sync.a();
			break;
		case 2:
			sync.b();
			break;
		case 3:
			sync.c();
			break;
			
		}
	}
	
}

public class SyncMain {

	public static void main(String[] args) {
		
		Sync sync =  new Sync(); //하나의 공유자원에 3개의 thread가 접근. 
		//자바에서 공유자원은 매개변수 형태로 만든다.
		SyncThread s1 = new SyncThread(sync, 1);
		SyncThread s2 = new SyncThread(sync, 2);
		SyncThread s3 = new SyncThread(sync ,3);
		
		s1.start();
		s2.start();
		s3.start();
	}
}
