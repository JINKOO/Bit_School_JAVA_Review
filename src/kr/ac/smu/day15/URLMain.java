package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.naver.com");
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("host 주소 : " + url.getHost());
			System.out.println("포트 번호 : " + url.getPort());
			System.out.println("경로 주소 : " + url.getPath());
			System.out.println("--------------------------------");
			
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			while(true) {		
				int c = isr.read();
				if(c == -1) {
					break;
				}
				System.out.print((char)c); //write일때만 String형 받고(buffered니까) 읽어올때는 ln써. 
			}
			
			isr.close();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
