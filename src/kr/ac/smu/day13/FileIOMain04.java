package kr.ac.smu.day13;

import java.io.FileOutputStream;
import kr.ac.smu.IOutil.FileClose;

/*
 *
 * FileOutputStream(String, append)
 * 
 * -FileOutputstream�� Ư¡.
 *  �ش� ���� ������ ����� �� ���Ϸ� �����.
 *  (FileInputStream�� �ش� ���� ������ ���� �߻�(FileNotFound�� �߻��Ѵ�.));
 *  
 *  ���� �������־ �� ���뿡 ���� ���� ����̱� ������ �������.
 *  �̾� ���ϼ� �ִ� ����� ������??
 *  FileOutputStream(String, append)�� ����.
 *  
 *  
 */
public class FileIOMain04 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
//		FileOutputStream fos2 = null;
		try {
			
//			fos = new FileOutputStream("iotest/test.txt");
			//append�� true�̸� �̾���δ�.
			fos = new FileOutputStream("iotest/test.txt",true);
			
			fos.write('A');
			fos.write('B');
			fos.write('C');
			fos.write('D');
			fos.write(65);
			
//			fos2 = new FileOutputStream("iotest/test.txt");
//			fos2.write('Z');
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
			
		}
	}
}
