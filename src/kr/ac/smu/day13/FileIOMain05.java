package kr.ac.smu.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain05 {

	/**
	 * DataOutputStream�� �̿��Ͽ� data1.txt�� ����
	 */
	static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/data1.txt");
			dos = new DataOutputStream(fos);
			
			dos.write('A');       // 1
			dos.writeChar('A');   // 2
			dos.writeInt(65);        // 1
			dos.writeDouble(65);  // 8
			
			fos.flush();
			System.out.println("���� �Ϸ� !");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			if(dos != null) {
				try {
					dos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/**
	 * data1.txt�� �ִ� ���� ��������
	 */
	static void read() throws Exception {
		
		FileInputStream fis = new FileInputStream("iotest/data1.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int c = dis.read();
		char c1 = dis.readChar();
		int c2 = dis.readInt();
		double c3 = dis.readDouble();
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("�б� �Ϸ�!");
		
		dis.close(); //�׻� filter Ŭ�� ���� Ŭ����.
		fis.close();
	}
	
	public static void main(String[] args) {
		
		//write();
		try {
		  read();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
