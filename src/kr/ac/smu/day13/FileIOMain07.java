package kr.ac.smu.day13;

//flush��� ����????

//finally try�κ� (if��)
//���� �ȳ��� FileReader�� ���� �а� FileWriter�̿��ؼ� ���ο� ���Ϸ� �����Ҷ��� ������ �˾Ƽ� �Ǵ� ����.
//���� ������ ������ �� ���ھ� �޴� ���ΰ�??
//����Ʈ ������ �������� int��??

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
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
			// ���ܰ� �߻� �ϸ� �� ��� catch�� �����Ѵ�. ����
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
