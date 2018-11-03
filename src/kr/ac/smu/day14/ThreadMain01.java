package kr.ac.smu.day14;
/*
 * Thread 2�� ���� �ϰ�
 * thread�̸� �ٲٴ� ���α׷�.
 *
 * thread ���� 2���� ���.
 * 
 * 1. Thread class��� �޴´�. 
 * 
 * 2. Runnable class ��� �޴´�.
 * 
 * ����ڴ� thread�� �����ϰ� threadť�� �ִ� �� �����Ѵ�.
 * ������ JVM�� �˾Ƽ� �Ѵ�.
 * 
 * thread�� �������� �ϴ����� run()�� �������̵� �Ѵ�.
 * 
 */

//���⼭�� 2���� thread�� �̸��� �ٲٴ� ����� �����Ѵ�.
//class�� �ϳ��̰� ������ �������̵� �� run()�� ���� �ϱ� ����.
class ThreadName extends Thread {
	
	public ThreadName() {
		super();
	}
	
	public ThreadName(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		System.out.println("�������� Thread�̸� : " + getName());
		
		 int index = getName().indexOf('-');
		 String str = getName().substring(index);
		 
		 setName("ChangeName" + str);
		 
		 System.out.println("����� Thread�̸���  : " + getName());
	}
}

public class ThreadMain01 {

	public static void main(String[] args) {	

		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName(); //���� thread���� ���� ����.
		
		t1.start(); 
		t2.start(); //
	}
}
