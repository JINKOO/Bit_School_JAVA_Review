package kr.ac.smu.day08.abs01;

import java.util.Scanner;

public class BusMenu {

	public void choiceType() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Hyundai_Bus   2.KIA_BUS");
			System.out.print("���� : ");

			Bus bus = null;
			int type = sc.nextInt();
			sc.nextLine();

			switch (type) {
			case 1:
				bus = new Hyundaibus("Universe Luxury", 37, "CNG", false);
				break;
			case 2:
				bus = new KIAbus("SilkRoad", 45, "����", true);
				break;
			default:
				System.out.println("�޴� ��ȣ �ٽ� �Է�");
				System.out.println();
			}

			if (bus != null) {
				bus.info();
				System.out.println("==========================");
			}
		}
	}
}
