package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * ����Ѵ�.
 * ��߽ð��� 8�� �����̸� �ɾ
 *        8��~8��15�� ���̸� ����Ÿ��
 *        8��15�����Ķ�� �ý�Ÿ��
 * �б�����.
 * 
 */

public class IFMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����Ѵ�.");
		
		double time;
		System.out.println("��� �ð��� �Է��ϼ��� (8���̸� 8.00) : ");
		time = sc.nextDouble();
		sc.nextLine();
		
				
		if(time < 8.00) { //���ǹ� 1
			
			System.out.println("�ɾ��.");
		
		}else { //8�� ����
			//��ø if�� ���ǹ� 1�� �����ΰ͵� �� �ٽ� ������ ������.
			
			if(time < 8.15) { //���� ������ time>8.00 && time <=8.15���ص� �ȴ�. ����̵� ���ǹ� 1�� �������� �ʴ� �����̹Ƿ�
				System.out.println("����Ÿ�� ����.");
			}
			else {//8�� �����̸鼭 8��15�� ���� (���ǹ� 1�� �����̰� ���ǹ� 2�� ����)
				System.out.println("�ý�Ÿ�� ����.");
			}
			
		}
		System.out.println("�б�����.");
	}
}
