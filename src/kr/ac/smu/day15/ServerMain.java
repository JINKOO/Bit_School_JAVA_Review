package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * 
 * Server동작 방식
 * 1.포트 번호 열고
 * 2.server를 기다림
 * 3.accept() 함수 가 중요하다.
 * 
 * 
 */
public class ServerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			ServerSocket socket = new ServerSocket(10001);
			System.out.println("서버 구동중....");
			Socket client = socket.accept();
			System.out.println("접속한 client : " + client);
			
			//client로 메세지 전송.
			
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while(true) {
				String msg = sc.nextLine();
				if(msg.equalsIgnoreCase("bye")) {
					bw.write(msg);
					bw.newLine();
					bw.flush();
					System.out.println("client와의 연결을 종료합니다.");
					break;
				}	
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
			//client로 부터 입력 받은 메세지 읽어오기.
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			String data = br.readLine();
			System.out.println("Clinet >> " + data);
			
			if(data.equalsIgnoreCase("bye")) {
				System.out.println("Client가 연결을 종료했습니다.");
				break;
			}
			
			socket.close();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
