package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionMain {

	public static void main(String[] args) {
		
		try (
				FileOutputStream fos = new FileOutputStream("iotest/°íÁø±Ç.html");
				OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
		) {
			
			URL aurl = new URL("https://www.naver.com");
			URLConnection uc = aurl.openConnection();
			
			InputStream is = uc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				
				bw.write(data);
				bw.newLine();
				bw.flush();
			}
			
			br.close();
			bw.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
