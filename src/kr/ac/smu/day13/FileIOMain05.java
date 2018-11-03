package kr.ac.smu.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain05 {

	/**
	 * DataOutputStream을 이용하여 data1.txt에 쓰기
	 */
	static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/data1.txt");
			dos = new DataOutputStream(fos);
			
			dos.write('A');       // 1
			dos.writeChar('A');   // 2
			dos.writeInt(65);        // 1
			dos.writeDouble(65);  // 8
			
			fos.flush();
			System.out.println("쓰기 완료 !");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			if(dos != null) {
				try {
					dos.close();
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
	
	/**
	 * data1.txt에 있는 내용 가져오기
	 */
	static void read() throws Exception {
		
		FileInputStream fis = new FileInputStream("iotest/data1.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int c = dis.read();
		char c1 = dis.readChar();
		int c2 = dis.readInt();
		double c3 = dis.readDouble();
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("읽기 완료!");
		
		dis.close(); //항상 filter 클라스 먼저 클로즈.
		fis.close();
	}
	
	public static void main(String[] args) {
		
		//write();
		try {
		  read();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
