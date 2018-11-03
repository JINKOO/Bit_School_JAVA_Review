package kr.ac.smu.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * FileIOMain03.java -> FileIOMain03_CopyRight.txt
 * 
 */
public class FileIOTestMain {

	public static void write() throws Exception {

		FileReader fr = new FileReader("iotest/FileIOMain03.java");
		FileWriter fw = new FileWriter("iotest/박 자바.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		System.out.println("파일 복사 완료.");
		
		bw.close();
		br.close();
		fw.close();
		fr.close(); //예외를 던져버리니까 여기서는 예외처리 안해
	}

	public static void main(String[] args) {
		
		try {
			write();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
