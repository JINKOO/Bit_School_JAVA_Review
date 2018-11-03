package kr.ac.smu.day07;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = new String("Hello World");
		String str1 = new String();
		
		System.out.println("<< substring() >>");
		str = str.substring(0);
		System.out.println(str);
		
		str = str.substring(0,5); //0-4������ 
		System.out.println(str);
		
		str1 = str.substring(2,3);
		System.out.println(str1);
		
		System.out.println("<< replace() >>");
		
		String str3 = new String("Hello World");
		str3 = str3.replace("ll", "a");
		System.out.println(str3);
		
		str3 = str3.replace("a", "ll");
		System.out.println(str3);
		
		System.out.println("<<trim()>>"); //trim()�� ���ڿ��� �ִ� ������ ������ ���Ѵ�.
		String str4 = new String("         H  I          ");
		System.out.println(str4 + ", " + str4.length());
		str4 = str4.trim();
		System.out.println(str4 + ", " + str4.length());
		
		
		System.out.println("<<split()>>"); 
		String name = new String("ȫ�浿:������:���ؿ�:���ȣ:�輱��");
		
		String[] arr = name.split(":");
		for(String names : arr) {
			System.out.println(names);
		}
		
		System.out.println("====================================");
		
		//int�� => String��
		int num = 123;
		String str5 = String.valueOf(num);//���ڿ��� �ٲ�.
		System.out.println(num + 100);  //����
		System.out.println(str5 + 100); //���ڿ�
		
		char[] cArr = {'H','e','l','l','o'};
		str5 = String.valueOf(cArr);
		System.out.println(str5);
		
		//String�� => int��
		str5 = "12345";
		num = Integer.valueOf("12345");
		System.out.println(str5 + 1);
		System.out.println(num + 1);
		
		
		
		
		
	}
}
