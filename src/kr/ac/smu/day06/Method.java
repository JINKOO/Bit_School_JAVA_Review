package kr.ac.smu.day06;

/*
 * �޼ҵ� �����ε�
 * 
 * ������ �޼ҵ� �� ���簡��
 *   �ڹٿ����� �޼ҵ�� + �Ű������� �޼ҵ带 �����Ѵ�.
 *   C������ �޼ҵ������ ����.
 *   ���� Ÿ�Ը� �ٸ��ٰ� �����ε� �߻� ���� �ʴ´�.(���� Ÿ���� ��� ����.)
 *  
 * �Ű� ������ �ٸ��� ������ ���� �ൿ�� �����Ҷ� �� �� �ִ�.
 * ���� ����ȯ�� �Ͼ��. 
 * 
 */

public class Method {
	
	public void call(int num) {
		System.out.println("int�� �Ű� ���� ������ call() : " + num );
	}
	
	public void call(double num) {
		System.out.println("double�� �Ű� ���� ������ call() : " + num );
	}
	
	public void call(String a) {
		System.out.println("StringŬ���� �Ű� ���� ������ call() : " + a);
	}
	
	public void call(int num1, char x) {
		
		for(int i = 0; i<num1; i++) {
			System.out.println("[" + (i+1) + "]" + x);
		}
		System.out.println();
	}
}
