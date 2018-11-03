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

	//사진, 동영상은 바이트 스트림쓴다.
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala_copy.jpg");
			
			while(true) {
				int c = fis.read(); //한 바이트씩 읽어 온다.
				if(c == -1) {  //만약 더이상 읽을 것이 없다면 -1
					break;
				}
				fos.write(c); //바이트를 읽어오니까
			}
			
			fos.flush();
			System.out.println("복사 완료");
			
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
