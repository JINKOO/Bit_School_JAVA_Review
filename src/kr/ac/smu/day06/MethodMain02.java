package kr.ac.smu.day06;

import java.util.Scanner;

//SongŸ���� �޼ҵ� ����

class Song {

	String name;
	String title;
	
}

class Bus {
	
	String name;
	String company;
}

public class MethodMain02 {
	
	public static Bus bus(String type) {
		
		Bus b = new Bus();
		b.name = type;
		
		return b;
	}
	
	public static Song[] singer(String type) { //�߶��/Ʈ��Ʈ ���� �����ϱ�.
		
		Song[] sArr = new Song[2];
		for(int i = 0; i<sArr.length; i++) {
			sArr[i] = new Song();
		}
		
		switch(type) {
		case "�߶��":
			sArr[0].name = "������";
			sArr[1].name = "��  ��";
			break;
			
		case "Ʈ��Ʈ":
			sArr[0].name = "������";
			sArr[1].name = "������";
			break;
		}
		return sArr;
	}
	
	public static void main(String[] args) {
	
		
		Song[] sArr = singer("�߶��");
		Song[] sArr2 = singer("Ʈ��Ʈ");
		
		
		Bus b = bus("����");
		System.out.println(b.name);
		for(Song str : sArr) {
			System.out.print(str.name + " ");
		}
	}
}
