package kr.ac.smu.day04;

import java.util.Arrays;

/*
 * �����ڷ��� �迭
 */
public class ArrayMain02 {

	public static void main(String[] args) {
		
		//"����" "�ڹ�" "����" ���ڿ��� �����ϴ� strArr�迭 ����
		
		String[] strArr1 = {"������", "������", "������", "�ڼ���"};  //{} ����Ҷ����� []�ȿ� ũ�� �Ⱦ���.
		String[] strArr2 = new String[] {"2018��", "1��", "19��"};
		String[] strArr = new String[3];
		
		System.out.println("# ���� strArr[i]�� ����ִ� ���� ���");
		for(String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("# �ʱ�ȭ");
//		strArr[0] = "����";
//		strArr[1] = "�ڹ�";
//		strArr[2] = "����";
		
		strArr = new String[] {"����", "�ڹ�", "����"};
		System.out.println("# ���� strArr[i]�� ����ִ� ���� ���");
		for(int i = 0; i<strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		for(String str : strArr) {
			System.out.print(str + " ");
		}
		
		String str = new String(Arrays.toString(strArr2));
		System.out.println(str);
		
		Ko jin = new Ko();
		Ko[] arr = new Ko[2];
		
		arr[0] = new Ko();
		arr[1] = new Ko();
		
		for(int i = 0; i< arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
	}
}

class Ko {
	
}
