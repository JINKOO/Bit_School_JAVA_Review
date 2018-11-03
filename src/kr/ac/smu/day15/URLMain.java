package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.naver.com");
			
			System.out.println("�������� : " + url.getProtocol());
			System.out.println("host �ּ� : " + url.getHost());
			System.out.println("��Ʈ ��ȣ : " + url.getPort());
			System.out.println("��� �ּ� : " + url.getPath());
			System.out.println("--------------------------------");
			
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			while(true) {		
				int c = isr.read();
				if(c == -1) {
					break;
				}
				System.out.print((char)c); //write�϶��� String�� �ް�(buffered�ϱ�) �о�ö��� ln��. 
			}
			
			isr.close();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
