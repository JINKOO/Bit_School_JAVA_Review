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
//Clinet������ �ٽ� ������.
	public static void main(String[] args) {
		
		try {
			
			ServerSocket socket = new ServerSocket(10001);
			System.out.println("���� ������...");
			
			Socket client = socket.accept();
			System.out.println("����� client : " + client.getInetAddress().getHostAddress());
			
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("[" + client.getInetAddress().getHostAddress() + "]" + "�� ���� ����");
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
