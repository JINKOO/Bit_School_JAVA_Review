package kr.ac.smu.day10;

import java.util.Random;

/*
 * final Ű����
 * �̿�Ǵ� �� 3����
 * 
 * 1.������� : ���
 * 2.�޼ҵ� : �������̵� ����.
 * 3.class : ��� ����.
 * 
 */

/*final*/ class Super {

	private /* final */ int max = 100;

	public Super() {
		this.max = 10;
	}

	public /*final*/ void info() {
		System.out.println("Super class���� ������ info()...");
	}
}


class Sub extends Super {
	
	@Override
	public void info() {
		System.out.println("Sub class���� ������ info()...");
	}
}

class MyRandom extends Random{

	@Override
	public int nextInt() {
		return super.nextInt() + 1;
	}
	
	/*
	 * �ռ� ���� ����̾�.
	 * ���� �� ��Ư���� �ʾ�..?? �ƴϾ�..??
	 * 
	 * �� ���� 
	 * MyRandom�̶�� class�� ����(�����) ������ class��.
	 * �ٵ� �갡 Random class�� ��ӹ޳�???
	 * Random class => �츮�� ������ ������ �߻� ��ų�� ����ߴ� class! �ڹٿ��� ���������ݾ�..
	 * ���� Random class�ȿ��� nextInt()��� �޼ҵ尡 �־�.
	 * 
	 * �� ��Ӱ����϶� �������̵��� �����??
	 * =>�޼ҵ� ������!
	 * �������̵��� ���ؼ� ���� nextInt()�� �������ϴ� �ž�.
	 * ���⼱ 
	 * �տ��� ����+1�� ���̱� �������ϱ� ���� ���� +1�� ���ִ� ����� �����Ǹ� �Ѱ��̾�.
	 * 
	 * 
	 * �̷��� ���� API�� ��ӹ޾Ƽ� 
	 * ����ڰ� �� API�� �ִ� �޼ҵ带 �ٽ� ������ �� �� �־�!
	 *  
	 * �� String class�� Ư���ϰ� final�̿��� 
	 * �޼ҵ� �������̵��� ���� �޼ҵ� ������ �Ұ���.
	 * 
	 */
	
}


public class FinalMain {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.info();
		
		System.out.println("=======================");
		
		/*
		 * 1-100���� ���� �ϳ��� �����Ұž�.
		 * 
		 * �̶����� �ؿԴ� ����� ������ ����.
		 * 
		 */
		
		Random r1 = new Random();
		int num1 = r1.nextInt(100) + 1;
		System.out.println("�߻��� ���� : " + num1);
		
		/*
		 * �׷��� ���� ���α׷� �����Ҷ� �ڵ忡��
		 * ���� �߻��� ��κ� 1~n���� ������ ������ �߻���.
		 * 0~n���̴� ���� ����.
		 * 
		 * 1���� �����Ϸ��� ���� ������ �ʾ�..?? (�ƴѰ�..)
		 * ��ư ����� �̷���..
		 * �׷��ٸ� +1�� �Ⱥ��̰� 
		 * 1-100������ ������ �߻� ��Ű�� �ڵ带 ¥����!
		 * 
		 */

		MyRandom r2 = new MyRandom();
		int num2 = r2.nextInt(100);
		System.out.println("�������Ͽ� �߻���Ų ���� : " + num2);
	}
}
