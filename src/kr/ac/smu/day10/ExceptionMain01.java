package kr.ac.smu.day10;

import java.util.Random;

/*
 * ���� ó��.
 * 
 * �����߻� 2���� : 1.����  2.����(������ �ɰ��� ����).
 * 
 * ���� ����ó���� ����ڰ� if-else���� ����Ͽ� ó���Ѵ�.
 * if-else���� ����ϸ� ����..�� ���� try-catch�� ����ϴ� �ɱ�
 * =>����ڰ� �������� ���ϴ� ���ܰ� �߻��� �� �ִ�.(������ ��ó�� �ʿ伺)
 * ���� ���ܰ� �߻��ߴ� �ϴ��� �� �κж����� ���α׷��� ������ ����Ǵ� ���� ���� �� �ִ�.
 * ���� ����, ���ܰ� �߻��ϸ� ���α׷��� ���� ����ȴ�.
 * ������ ���� ���ܰ� �߻��ϴ��� �� ������ �ڵ�� ���� �ϰ� �ʹ�.
 * 
 * ���Ǵ� 5���� Ű����
 * 
 * 1.try
 * 2.catch
 * 3.finally
 * 4.throws
 * 5.throw
 * 
 * 1,2,3�� : ����ڰ� ���ܸ� ���� ó���Ѵ�.
 * =>���� ���� ó��
 * try - ���� �߻��� �� �ִ� �κ��� {}�� ���´�.
 * catch - ���� ó���ϴ� �κ�.
 *         catch�� ���ٸ� ���α׷��� ���ܺκп��� �ٷ� ��������ȴ�.
 * finally - ���ܻ�� ���� ������ ���� �Ǵ� �κ�.
 * 
 * 
 * 4�� : ȣ���� �޼ҵ忡�� �ñ��.
 * =>���� ����ó��
 * 
 * throws
 * ���� �����Ҷ� ���� ���δ�.(�����ϴ� class�� '�� �޼ҵ�� ����ó���� �ʿ��մϴ�.')
 * �޼ҵ� ������ ���ܸ� ���� ó���ϴ� ���� �ƴ϶�
 * �ڽ��� ȣ���� �޼ҵ忡�� ����ó���� ���ѱ�� �����ϴ� Ű����.(���� ó��)
 * =>����ó���� ���������� �����ϴ� class�� �����.
 * 
 * abstract class AAA {
 * 
 *    void info() {
 *    
 *    }
 * 
 *    abstract void read();
 *    abstract void write();    
 *      read�� write���� ���ܰ� �߻��� �� ����..
 *      �׷��� �̷��� ���� �������̵��� try-catch�� ���� �Ⱦ����� ���ݾ�.
 *      ������ ���� ���� ��.
 *      
 *    abstract void read() throws ArithmeticException;
 *    abstract void write() throws NullPointException;
 *    //�� �ΰ��� �޼ҵ�� �ݵ�� ����ó���� ���ٰ��� ����Ѵ�.
 *    
 *    Exception class�� �����Ѵ�.
 *    �� class�ȿ� ArithmeticException, NullPointException
 *    
 *    ���������� ó��
 *    abstract public void print() throws Exception;
 *  
 * }
 * 
 * 5�� : ����� ���� ����ó��.
 * throw
 * JVM�� ������ ��� ���ܰ� �ƴѵ� 
 * ����ڰ� ���ܷ� �����ϰ� �ʹ�.
 * ex) � ������ 5���� ũ�� ���ܴ�.(JVM���忡���� ��� ���ܰ� �ƴѵ�..)
 * 
 */

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		
		int num = r.nextInt(2);
		System.out.println("����� ���� : " + num);
		System.out.println(10/num); //num�� 0�̸� �ؿ��� ����ȵǰ� �ٷ� ����.
		System.out.println("main end...");	
	}
}
