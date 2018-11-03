package kr.ac.smu.day13;

import java.io.FileReader;
import java.io.FileWriter;

/*
 * 
 * Reader // Writer
 * 
 * 바이트 단위가 아닌 문자 단위로 받는다.
 */

//iotest/FileIOMain03.java --> FileIOMain03.java.txt로 복사

public class FileIOMain06 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.txt");
			
			while(true) {
				int c = fr.read();
				if(c == -1) {
					break;
				}
				fw.write(c);  //이거는 출력할때 왜 알아서 계행이되는가?
			}
			
			fw.flush();
			System.out.println("파일 복사 완료!");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			if(fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fw != null) {
				try {
					fw.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
