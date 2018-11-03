package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// try catch문 중첩.

/*
 * a.txt파일이 없을 수 있다. 컴파일 시점에 에외처리 Checked Exception.
 * 무조건 예외를 처리하도록 유도한다(사용자에게).
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
