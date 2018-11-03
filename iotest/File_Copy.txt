package kr.ac.smu.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.smu.IOutil.FileClose;

/*
 * buffered class -> 일종의 필터 이다.
 * 
 */
public class FileIOMain03 {

	//버퍼를 사용한 사진 복사.
	public static void main(String[] args) {
		
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		BufferedInputStream bs = null;
		BufferedOutputStream bo = null;
		
		try {
			
			fi = new FileInputStream("iotest/Koala.jpg");
			fo = new FileOutputStream("iotest/KO.jpg"); //outputstream은 해당 파일 없으면 생성해줌.
			
			bs = new BufferedInputStream(fi);
			bo = new BufferedOutputStream(fo);
			
			long start = System.currentTimeMillis();
			while(true) {
				int c = bs.read();
				if(c == -1) {
					break;
				}
				bo.write(c);
			}
			
			fo.flush();
			long end = System.currentTimeMillis();
			System.out.println("복사완료!");
			System.out.println("걸린 시간 : " + (end - start) / 1000.);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fi, bs);
			FileClose.close(fo, bo);
			
//			if(bo != null) {
//				try {
//					bo.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(bs != null) {
//				try {
//					bs.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if(fi != null) {
//				try {
//					bs.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if(fo != null) {
//				try {
//					bs.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
		}
		
	}
}
