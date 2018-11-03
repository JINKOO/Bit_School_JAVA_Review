package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
//Clinet보낸거 다시 재전송.
	public static void main(String[] args) {
		
		try {
			
			ServerSocket socket = new ServerSocket(10001);
			System.out.println("서버 구동중...");
			
			Socket client = socket.accept();
			System.out.println("연결된 client : " + client.getInetAddress().getHostAddress());
			
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("[" + client.getInetAddress().getHostAddress() + "]" + "와 접속 해제");
					socket.close();
					break;
				}
				
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
			
			socket.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
