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
 * Server���� ���
 * 1.��Ʈ ��ȣ ����
 * 2.server�� ��ٸ�
 * 3.accept() �Լ� �� �߿��ϴ�.
 * 
 * 
 */
public class ServerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			ServerSocket socket = new ServerSocket(10001);
			System.out.println("���� ������....");
			Socket client = socket.accept();
			System.out.println("������ client : " + client);
			
			//client�� �޼��� ����.
			
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while(true) {
				String msg = sc.nextLine();
				if(msg.equalsIgnoreCase("bye")) {
					bw.write(msg);
					bw.newLine();
					bw.flush();
					System.out.println("client���� ������ �����մϴ�.");
					break;
				}	
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
			//client�� ���� �Է� ���� �޼��� �о����.
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			String data = br.readLine();
			System.out.println("Clinet >> " + data);
			
			if(data.equalsIgnoreCase("bye")) {
				System.out.println("Client�� ������ �����߽��ϴ�.");
				break;
			}
			
			socket.close();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
