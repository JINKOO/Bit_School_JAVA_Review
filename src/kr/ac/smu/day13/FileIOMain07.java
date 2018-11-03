package kr.ac.smu.day13;

//flush사용 기준????

//finally try부분 (if문)
//버퍼 안끼고 FileReader로 파일 읽고 FileWriter이용해서 새로운 파일로 복사할때는 계행이 알아서 되는 이유.
//문자 단위로 받으면 한 문자씩 받는 것인가??
//바이트 단위로 받을때는 int형??

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOMain07 {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		PrintWriter pw = null;

		try {

			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/File_Copy.txt");

			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			pw = new PrintWriter(bw);

			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}

				// bw.write(str);
				// bw.newLine();

				pw.println(str);
			}

			bw.flush();
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
			// 예외가 발생 하면 그 즉시 catch문 수행한다. 따라서
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (br != null) {
					try {
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				if (fr != null) {
					try {
						fr.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				if (fw != null) {
					try {
						fr.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
