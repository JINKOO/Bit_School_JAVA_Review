package kr.ac.smu.day08.Homework;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	
	public boolean endOrcontinue() {
		System.out.print("��� �ҷ�?(����� quit�Է�) => ");
		
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine();
		
		if(str.equals("quit")) {
			return false;
		}else if(str.equalsIgnoreCase("y")) {
			return true;
		} else {
			System.out.println("�ٽ� �Է� �ϼ���");
			return true;
		}
	}
	
	
	public void choiceType() {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num1 = r.nextInt(10) + 1;
		int num2 = r.nextInt(10) + 1;
		int type;
		boolean bool;
		
		while (true) {
			System.out.println("1. ���簢��  2. ���簢��  3. �ﰢ��  4. ��");
			System.out.print("���� : ");

			type = sc.nextInt();
			sc.nextLine();
			
			Shape sh = null;  //������ ����ȯ.
			switch (type) {
			case 1:
				sh = new Square(num1);
				break;
			case 2:
				sh = new Rectangle(num1, num2);
				break;
			case 3:
			    sh = new Triangle(num1, num2);
				break;
			case 4:
				sh = new Circle(num1);
				break;
			default:
				System.out.println("�߸� �Է� �Ͽ����ϴ�.");
			}
			
			if(sh != null) {
				sh.printArea();
			}

			bool = endOrcontinue();
			if(!bool) {
				break;
			}
			System.out.println();
		}
	}
}
