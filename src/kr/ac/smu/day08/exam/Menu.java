package kr.ac.smu.day08.exam;

import java.util.Random;
import java.util.Scanner;

public class Menu {

	public int choiceMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.정사각형  2.직사각형  3.삼각형  4.원");
		System.out.print("선택 : ");
		int type = sc.nextInt();
		sc.nextLine();

		return type;
	}

	public void process(int type) {

		switch (type) {
		case 1: // 정사각형
			Square sq = new Square();
			sq.print();
			sq.printArea();
			sq.loop();
			break;
		case 2: // 직사각형
			Rectangle rec = new Rectangle();
			rec.print();
			rec.printArea();
			rec.loop();
			break;
		case 3: // 삼각형
			Triangle tri = new Triangle();
			tri.print();
			tri.printArea();
			tri.loop();
			break;
		case 4: // 원
			Circle cir = new Circle();
			cir.print();
			cir.printArea();
			cir.loop();
			break;
		default:
			System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요!");
			System.out.println();
			type = choiceMenu();
			process(type);
		}
	}
}
