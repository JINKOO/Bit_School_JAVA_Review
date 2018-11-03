package kr.ac.smu.day13;

import java.io.FileOutputStream;
import kr.ac.smu.IOutil.FileClose;

/*
 *
 * FileOutputStream(String, append)
 * 
 * -FileOutputstream의 특징.
 *  해당 파일 없으면 만들고 빈 파일로 만든다.
 *  (FileInputStream은 해당 파일 없으면 예외 발생(FileNotFound가 발생한다.));
 *  
 *  기존 내용이있어도 그 내용에 덮어 쓰는 방식이기 때문에 사라진다.
 *  이어 붙일수 있는 방법은 없을까??
 *  FileOutputStream(String, append)를 쓴다.
 *  
 *  
 */
public class FileIOMain04 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
//		FileOutputStream fos2 = null;
		try {
			
//			fos = new FileOutputStream("iotest/test.txt");
			//append가 true이면 이어붙인다.
			fos = new FileOutputStream("iotest/test.txt",true);
			
			fos.write('A');
			fos.write('B');
			fos.write('C');
			fos.write('D');
			fos.write(65);
			
//			fos2 = new FileOutputStream("iotest/test.txt");
//			fos2.write('Z');
			System.out.println("파일 저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
			
		}
	}
}
