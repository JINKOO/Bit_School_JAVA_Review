package kr.ac.smu.day14;

/*
 * 
 * a() b()�� �����Ƽ� ��� �ʹ�.
 * 
 * wait()
 * �� thread�� �����ϴٰ��� wait()������ �ڽ��� block�ȴ�.
 * �۾� ������ �Ѱ��ش�.
 * 
 * notify()
 * block������ thread�� �� �ϳ��� ������ runnable ���·� �����.
 * 
 */
class Data {
	
	public synchronized void a() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("a()ȣ�� ��...");
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
			System.out.println("b()ȣ�� ��...");
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
