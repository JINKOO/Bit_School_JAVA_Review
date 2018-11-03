package kr.ac.smu.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 
 * 1. Stream open
 * 2. read or write
 * 3. stream close
 * 
 */
public class FileMain02 {

	//����, �������� ����Ʈ ��Ʈ������.
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala_copy.jpg");
			
			while(true) {
				int c = fis.read(); //�� ����Ʈ�� �о� �´�.
				if(c == -1) {  //���� ���̻� ���� ���� ���ٸ� -1
					break;
				}
				fos.write(c); //����Ʈ�� �о���ϱ�
			}
			
			fos.flush();
			System.out.println("���� �Ϸ�");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		} finally {
		
			if(fis != null) {
				try {
					fis.close();
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
	
}
