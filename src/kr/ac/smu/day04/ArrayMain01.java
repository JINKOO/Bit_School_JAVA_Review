package kr.ac.smu.day04;

import java.util.Arrays;

/*
 *  �迭 
 *  1.������ Ÿ���� �������� ����.
 *  2.�ڹٿ��� �迭�� heap������ ������ �Ҵ��ϰ� �� ������ ����Ű�� ������ �����Ѵ�.
 *    new Ű���� : heap������ ������ �Ҵ��ϴ� ����.
 *  3.�⺻ �ڷ��� �迭 // ���� �ڷ��� �迭
 *    �⺻ �ڷ���
 *    int[] arr; //���� arr�� ���� ����Ű���� �𸥴�.
 *    int[] arr = new int[10]; //�� ���Ҵ� 0�� ���� ������.
 *    
 *    ���� �ڷ����迭
 *    2���� �迭�� ���¸� ������.
 *    ����ڷ� ���� �󸶸�ŭ�� ������ �Ҵ����� �𸣱� ������ �̸� ����Ű�� �������� ������ �������� �迭�� �ʿ��ϴ�.
 *    String[] strarr = new String() {"����", "�ڹ�", "����"};
 *    �������� �迭�� heap������ ��������� 
 *    �� ���� �������� �ش� ���ڿ��� �ִ� ������ ����Ű���� �ؾ��Ѵ�.
 *    
 *  4. Index
 *    index�� �迭���� ���ҵ鿡 �����ϱ� ���� �ʿ��ϴ�.
 *    �迭�� ���� �ּҸ� ����Ű�� �ִ� ������ index�� ���� �����Ѵ�.
 *    �����ּҸ� �˰� �ִٸ� �ش� Ÿ���� �� ����Ʈ���� �˱⶧���� ������ �����ϴ�.
 *   -index�� ���
 *    int[] num = new int[5];
 *    num + sizeof(int)*0;
 *        + sizeof(int)*1;
 *        + sizeof(int)*2;...
 *    
 *    index�� ����ȭ �ؼ� ����� �� �� �ִ�.
 *    �迭���� ������ ���԰� ������ �����ϴ�.
 *    
 *  5. �迭 ���� ���3����
 *     
 *     int[] arr = new int[10];
 *     
 *     -index�� �̿��� ���
 *      for(int i = 0; i<arr.length; i++)
 *     
 *     -1.5���� ���� for�� (��� ���Ҹ� ���. �κ� �ȵ�. ���� ����, �ܾ�ã�⿡ ����)
 *      for(int num : arr)
 *      
 *     -Arrays.toString(arr)�Լ� ���(��� ���Ҹ� ���. �κ� �ȵ�.)
 *      []�� ,�̿��Ͽ� �� ���Ұ� ��µȴ�.
 *    
 */
public class ArrayMain01 {

	public static void main(String[] args) {
		
		int[] iArr = new int[5];
		System.out.println("iArr : " + iArr);
		System.out.println("iArr�� ���� ���� : " + iArr.length);
		System.out.println("iArr[0] : " + iArr[0]);
		
		System.out.println("������ �ʱ�ȭ ����");
		
		for(int i = 0; i<iArr.length; i++) {
			iArr[i] = (i+1) * 10;
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("< Index�� �̿��� ��� >");
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("< 1.5���� ������ for�� �̿� ��� > ");
		for(int num : iArr) { //iArr.length��ŭ �ݺ��Ѵ�. �Է¿뵵�δ� �� �� ����. ��� �뵵�θ�.
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("< Arrays.toString()�Լ� �̿� >"); //���ϰ��� String���̴�. ���ҵ��� ���ڿ� ���·� ��� �Ѵ�.
		String str = new String(Arrays.toString(iArr));
		System.out.println(str);
		
	}
}
