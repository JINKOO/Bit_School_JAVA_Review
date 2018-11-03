package kr.ac.smu.day14;

/*
 * join()
 * Thread class�� �ִ� �޼ҵ�.
 * 
 * �� �� thread�� �� ����ɶ����� ��ٸ�.
 * �� ����ǰ� �ִ� thread�� ���ѷ����̸� ��ٸ��� thread�� ��� block����.
 * 
 * �׷��� join() �ȿ� �ð��� ���ش�.
 * ������ �� �ð����ȸ� �����ϸ� �� �ð����� ������ ������ ���
 * �ٸ� tread�� ���� �� �� �ִ�.
 * 
 * =>����ȭ �ʿ� 
 * �ѹ��� �ش� �ڵ� ��� ����.
 * 
 * ���� �ǰ� �ִ� thread���� join������ �ٷ� block? �ƴϸ� ruunaable?
 */
class BoyThread extends Thread {

	public void run() {

		GirlThread gt = new GirlThread();

		System.out.println("(���� ģ��) : ���� �׳��� ����ģ�� �Դϴ�.");
		System.out.println("(���� ģ��) : ���� �׳�� ��ȭ�� ����� �߽��ϴ�.");
		System.out.println("(���� ģ��) : ��ȭ�� �� �����ε� ���� �ȿɴϴ�.");
		System.out.println("(���� ģ��) : ���� �׳ฦ ��ٸ��� �ֽ��ϴ�.");

		gt.start();

		try {
			gt.join(5000); //5�ʰ� ������ girl�� ������ runnable���·� ����.
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("(���� ģ��) : 5�� ������ ������!.");
//		System.out.println("(���� ģ��) : �� �Խ��ϴ�!.");
//		System.out.println("(���� ģ��) : ��ȭ�� ���� ���ϴ�.");

	}
}

class GirlThread extends Thread {

	public void run() {

		System.out.println("(����ģ��) : ���� ����ģ�� Thread�Դϴ�.");
		System.out.println("(����ģ��) : ���� ����ģ�� �������� üũ�Ϸ� �մϴ�.");
		System.out.println("(����ģ��) : 10�ʵ� ����ٸ��� ����ģ���� �ƴϰ���?");

		
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("(����ģ��) : " + i + "�ʰ� �������ϴ�.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("(����ģ��) : ����ģ���� �����ϴ�.....");
	}
}

public class JoinMain {

	public static void main(String[] args) {

		BoyThread bt = new BoyThread();
		bt.start();
	}
}
