package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			Socket socket = new Socket("localhost", 10001);
			System.out.println("������ ���� �Ǿ����ϴ�.");

			// ������ ���� �о����.
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				String data = br.readLine();
				if(data.equalsIgnoreCase("bye")) {
					System.out.println("������ ������ �����߽��ϴ�.");
					break;
				}
				System.out.println("Server >>> " + data);
				
				//server�� ����.
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
				
				String msg = sc.nextLine();
				if(msg.equalsIgnoreCase("bye")) {
					bw.write(msg);
					bw.newLine();
					bw.flush();
					break;
				}
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
