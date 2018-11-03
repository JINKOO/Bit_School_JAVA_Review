package kr.ac.smu.day15;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {
//�Է¹޾Ƽ� ������ ������ �ٽ� �� �Է� �������� ����.
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("�߸��� �����Դϴ�.");
			System.out.println("�ùٸ� ���� : host��ȣ   port��ȣ");
		}
		
		try {
			
			Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
			
			//Ű����� ���� �о�� ��ü ����.
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader key = new BufferedReader(isr);
			
			//������ ������ ��ü
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//������ ���� �����Ѱ� �ٽ� �޴� ��ü
			is = socket.getInputStream();
			isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String msg = key.readLine();
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("Ŭ���̾�Ʈ [" + socket.getInetAddress().getHostAddress() + "] ���� ����");
					socket.close();
					break;
				}
				
				bw.write(msg);
				bw.newLine();
				bw.flush();
				
				String msg2 = br.readLine();
				System.out.println("Server�� �������� �ż��� : [" + msg2 + "]");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
