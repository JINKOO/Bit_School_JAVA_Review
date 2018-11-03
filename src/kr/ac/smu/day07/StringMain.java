package kr.ac.smu.day07;

public class StringMain {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str2 = new String("hello");
		String str3 = new String("HELLO");
		
		//�ּ� ��. �翬�� �ٸ���...���������� �ΰ��ε�..
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		boolean bool = str.equals("ko");
		boolean bool2 = str.equalsIgnoreCase(str3);
		if(bool) {
			System.out.println("���� ���� ���ڿ� �Դϴ�.");
		} else {
			System.out.println("���� �ٸ� ���ڿ� �Դϴ�.");
		}
		
		String prefix = "Hel";
		
		if(str.startsWith(prefix)) {
			System.out.println(prefix + "�����Ѵ�.");
		} else {
			System.out.println(prefix + "�� ���������ʴ´�.");
		}
		
		String strA = new String("banana");
		String strB = new String("boat");
		
		int compare = strA.compareTo(strB);
		if(compare == 0) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else if(compare < 0) {
			System.out.println(strA +  "<" +  strB);
		} else
			System.out.println(strA + ">" + strB);
		
		String[] names = { "ȫ�浿", "�̱��", "ȫ���", "ȫ�浿", "��ö��", "�ڱ浿", "����" };

		System.out.println("<<�̸��� ȫ�浿�� ��� �˻�>>");
		for(String name : names) {
			if(name.equals("ȫ�浿"))
				System.out.print(name + " ");
		}
		System.out.println();
		System.out.println("<<ȫ�� ���� ���� ��� �˻�>>");
		for(String name : names) {
			if(name.startsWith("ȫ")) 
				System.out.print(name + " ");
		}
		
		System.out.println();
		System.out.println("<<�̸��� ���� �� ��� �˻�>>");
		for(String name : names) {
			if(name.contains("��"))
				System.out.print(name + " ");
		}
		System.out.println();
		
		System.out.println("<<�̸��� �浿�� ��� �˻�>>");
		for(String name : names) {
			if(name.endsWith("�浿"))
				System.out.print(name + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
