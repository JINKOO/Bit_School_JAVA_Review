package kr.ac.smu.day13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * File Class extends Object
 * 
 * ���� �� ���丮 ������ �� �� �ִ�.
 * (������ ���� ������ �� �� ����);
 * 
 */
public class FileMain01 {

	public static void main(String[] args) {
		
		File fileObj = new File("iotest/a.txt");
		
		//filObj�� a.txt�� ������ �˾Ƴ��ڴ�.
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		String absolutePath = fileObj.getAbsolutePath();
		
		System.out.println("���� �̸� : " + fileName);
		System.out.println("���� ���� : " + parent);
		System.out.println("��� ��� : " + path);
		System.out.println("���� ��� : " + absolutePath);
		
		System.out.println("=======================================");
		//���� iotest/a.txt�� ����. �׳� ������ �ϰ� �ֳ� ���� Ȯ�� �ؾߵ�.
		
		if(fileObj.exists()) {
			System.out.println("a.txt������ �����մϴ�.");
		} else {
			System.out.println("a.txt������ �������� �ʽ��ϴ�.");
		}
		
		long size = fileObj.length();
		System.out.println("������ ũ�� : " + size);
		
		boolean bool = fileObj.isFile();
		System.out.println(fileName + " : " + (bool ? "�����Դϴ�." : "������ �ƴմϴ�."));
		
		bool = fileObj.isDirectory();
		System.out.println(fileName + " : " + (bool ? "���丮�Դϴ�." : "���丮 �ƴմϴ�."));
		
		long time = fileObj.lastModified();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("������ ���� ��¥ : " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(fileName + " : " + (bool ? "�бⰡ��" : "�б� �Ұ���"));
		
		bool = fileObj.canWrite();
		System.out.println(fileName + " : " + (bool ? "���� ����" : "���� �Ұ���"));
	}

	
}
