package kr.ac.smu.day14;

/*
 * 
 * a() b()를 번갈아서 찍고 싶다.
 * 
 * wait()
 * 한 thread가 실행하다가가 wait()만나면 자신은 block된다.
 * 작업 권한을 넘겨준다.
 * 
 * notify()
 * block상태인 thread들 중 하나를 깨워서 runnable 상태로 만든다.
 * 
 */
class Data {
	
	public synchronized void a() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("a()호출 됨...");
			try {
				notify();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void b() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("b()호출 됨...");
			try {
				notify();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class NotifyThread01 extends Thread {

	private Data data;
	
	public NotifyThread01(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.a();
	}
}

class NotifyThread02 extends Thread {
	
	private Data data;
	
	public NotifyThread02(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.b();
	}
}

public class NotifyMain {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		NotifyThread01 t1 = new NotifyThread01(data);
		NotifyThread02 t2 = new NotifyThread02(data);
		
		t1.start();
		t2.start();
		 
	}
}
