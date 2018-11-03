package kr.ac.smu.day13;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileIOMain08 {

	/*
	 * 1.7버전이후의 try문
	 * 
	 * IO시 필요한 class 변수를 선언하는 코드가 너무 길다.
	 * 이에 따른 close() 부분도 코드가 너무 길어 지게 되는데...
	 * 이를 해결 할 수 있다.
	 * 
	 * autoclose()를 상속받는 것만 된다.
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
			System.out.println("파일 복사 완료");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
