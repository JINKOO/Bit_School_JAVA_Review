package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * throws Ű���� �̿�.
 * 
 */

abstract class Parent {
	
	abstract void print();
	abstract void read() throws Exception;
	/*
	 * read() �޼ҵ�� ������ ����ó���� �ʿ�
	 * �տ��� ������������ throwsŰ���� ������ ����Ÿ���� �����־��µ�
	 * ��� ����Ÿ���� �θ�class�� Exception�̹Ƿ� �̰� �ᵵ �ȴ�.
	 * ����:���� ����ȯ.
	 * 
	 */
}

class Child extends Parent {

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void read() throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * ���⼭ ���� ó���� �ϴ� ���̾ƴ϶�
		 * �긦 ȣ���� �޼ҵ忡�� ���ش�.
		 * (������ �ѱ�ھ�! ���� �ϱ� �Ȱŵ�)
		 * 
		 */
	}
	
}

public class ExceptionMain06 {

	static void a() {
		System.out.println("a() ȣ��...");
		
		try {
			FileReader fr = new FileReader("a.txt");
		}catch(FileNotFoundException e) {
			e.getMessage();
		}
		
		/*
		 * a()���� ���� ����ó��.
		 * throws Ű���� ������� ����.
		 * 
		 */
	}
	
	static void b() throws NullPointerException, ArithmeticException {
		System.out.println("b() ȣ��...");
		
		String str = null;
		System.out.println("���ڿ��� ���� : " + str.length());
		
		System.out.println(10 / 0);
		

		System.out.println("!!!"); //

		/*
		 * b()�� ȣ���� �޼ҵ� = main�޼ҵ�
		 * ���� throwsŰ���尡 �����Ƿ� main���� b()�� ȣ���Ҷ� ����ó�� ���ش�.
		 * 72��° ���� ���� ���� �Ǵ�.
		 * ���ܰ� �߻��ϸ� ������ catch�� �̵�.
		 */
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		a();
		try {
			b();
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException ���� ó��");
			ne.getMessage();
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException ���� ó�� ");
			ae.getMessage();
		}
		System.out.println("main end...");
	}
}
