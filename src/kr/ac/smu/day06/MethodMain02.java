package kr.ac.smu.day06;

import java.util.Scanner;

//Song타입의 메소드 선언

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
	
	public static Song[] singer(String type) { //발라드/트로트 각각 구분하기.
		
		Song[] sArr = new Song[2];
		for(int i = 0; i<sArr.length; i++) {
			sArr[i] = new Song();
		}
		
		switch(type) {
		case "발라드":
			sArr[0].name = "아이유";
			sArr[1].name = "박  원";
			break;
			
		case "트로트":
			sArr[0].name = "태진아";
			sArr[1].name = "장윤정";
			break;
		}
		return sArr;
	}
	
	public static void main(String[] args) {
	
		
		Song[] sArr = singer("발라드");
		Song[] sArr2 = singer("트로트");
		
		
		Bus b = bus("현대");
		System.out.println(b.name);
		for(Song str : sArr) {
			System.out.print(str.name + " ");
		}
	}
}
