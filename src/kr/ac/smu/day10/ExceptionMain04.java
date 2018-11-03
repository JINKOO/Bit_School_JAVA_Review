package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// try catch�� ��ø.

/*
 * a.txt������ ���� �� �ִ�. ������ ������ ����ó�� Checked Exception.
 * ������ ���ܸ� ó���ϵ��� �����Ѵ�(����ڿ���).
 */
public class ExceptionMain04 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException fe) {
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fe.printStackTrace();
		}
	}
}
