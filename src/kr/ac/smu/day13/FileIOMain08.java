package kr.ac.smu.day13;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileIOMain08 {

	/*
	 * 1.7���������� try��
	 * 
	 * IO�� �ʿ��� class ������ �����ϴ� �ڵ尡 �ʹ� ���.
	 * �̿� ���� close() �κе� �ڵ尡 �ʹ� ��� ���� �Ǵµ�...
	 * �̸� �ذ� �� �� �ִ�.
	 * 
	 * autoclose()�� ��ӹ޴� �͸� �ȴ�.
	 * 
	 */
	public static void main(String[] args) {
		
		try (
				FileReader fr = new FileReader("iotest/FileIOMain03.java");
				FileWriter fw = new FileWriter("iotest/FileIO_Copy.txt");
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
		) 
		
		{
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				
				pw.println(str);
			}
			
			bw.flush();
			System.out.println("���� ���� �Ϸ�");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
