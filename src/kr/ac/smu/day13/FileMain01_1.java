package kr.ac.smu.day13;

import java.io.File;

public class FileMain01_1 {

	public static void main(String[] args) {
		
		/**
		 *   ���丮�� � ������ �ִ��� �˰� �ʹ�.
		 *   ��� ���ϵ��� �ֳ�..
		 */
		File dirObj = new File("iotest");
		
		//iotest������ ���� �ϴ��� �Ǵ�.
		boolean bool = dirObj.exists();
		System.out.println((bool ? "�����մϴ�." : "No ����"));
		
		//iotest�� ���丮 ���� ���� �Ǵ�.
		bool = dirObj.isDirectory();
		System.out.println(dirObj.getName() + " : " + (bool? "is Directory" : "Not directory"));
		
		System.out.println("<<���丮 �� �ִ� ���� List>>");
		
		String[] list = dirObj.list();
		
		for(String names : list) {
			System.out.println(names);
		}
		
		System.out.println("======================");
		
		File[] files = dirObj.listFiles();
		for(File file : files) {
			System.out.println(file.getName());
			System.out.println("���� ũ�� : " + file.length());
		}
		
		
		System.out.println("=============================");
		
		/**
		 * 
		 * mkdir() : ���� ������ �����Ѵٴ� �����Ͽ� �����Ѵ�.(������ ���� ����).
		 * mkdirs() : �ڱ� ��ο� ���� �͵� ��� ����� ����.
		 * 
		 * but �̹� �ִٸ� �Ѵ� ���� ���� �Ѵ�.
		 * 
		 */
//		dirObj = new File("iotest/�� ����/test");
//		bool = dirObj.mkdir();
//		System.out.println(bool ? "���� ����" : "���� ����");
//		
		dirObj = new File("iotest/������/test");
		bool = dirObj.mkdirs();
		System.out.println(bool ? "���� ����" : "���� ����");
		
		System.out.println("==================================");
		
//		dirObj = new File("error.log");
//		bool = dirObj.delete();
//		System.out.println(bool ? "���� ����" : "���� ����");
	}
}
