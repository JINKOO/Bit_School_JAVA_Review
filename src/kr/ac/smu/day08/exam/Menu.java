package kr.ac.smu.day08.exam;

import java.util.Random;
import java.util.Scanner;

public class Menu {

	public int choiceMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.���簢��  2.���簢��  3.�ﰢ��  4.��");
		System.out.print("���� : ");
		int type = sc.nextInt();
		sc.nextLine();

		return type;
	}

	public void process(int type) {

		switch (type) {
		case 1: // ���簢��
			Square sq = new Square();
			sq.print();
			sq.printArea();
			sq.loop();
			break;
		case 2: // ���簢��
			Rectangle rec = new Rectangle();
			rec.print();
			rec.printArea();
			rec.loop();
			break;
		case 3: // �ﰢ��
			Triangle tri = new Triangle();
			tri.print();
			tri.printArea();
			tri.loop();
			break;
		case 4: // ��
			Circle cir = new Circle();
			cir.print();
			cir.printArea();
			cir.loop();
			break;
		default:
			System.out.println("�߸� �Է� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���!");
			System.out.println();
			type = choiceMenu();
			process(type);
		}
	}
}
