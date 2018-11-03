package kr.ac.smu.day08.abs02;

import java.util.Scanner;

public class Menu {

	public void choiceType() {
		
		Scanner sc = new Scanner(System.in);
		Printer pr = null;
		System.out.println("입력");
		int type = sc.nextInt();
		sc.nextLine();
		
		switch(type) {
		case 1:
			pr = new LG();
			break;
		case 2:
			pr = new Samsung();
			break;
		default:
			System.out.println("메뉴 번호 잘못 입력 하였습니다.");
		}
		
		if(pr != null) {
			pr.print();
		}
	}
}
