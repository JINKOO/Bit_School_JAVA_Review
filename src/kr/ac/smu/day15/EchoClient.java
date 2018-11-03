package kr.ac.smu.day15;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {
//입력받아서 서버로 전송후 다시 그 입력 받은것을 받음.
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("잘못된 사용법입니다.");
			System.out.println("올바른 사용법 : host번호   port번호");
		}
		
		try {
			
			Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
			
			//키보드로 부터 읽어올 객체 생성.
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader key = new BufferedReader(isr);
			
			//서버로 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//서버로 부터 전송한거 다시 받는 객체
			is = socket.getInputStream();
			isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String msg = key.readLine();
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("클라이언트 [" + socket.getInetAddress().getHostAddress() + "] 연결 해제");
					socket.close();
					break;
				}
				
				bw.write(msg);
				bw.newLine();
				bw.flush();
				
				String msg2 = br.readLine();
				System.out.println("Server가 재전송한 매세지 : [" + msg2 + "]");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
