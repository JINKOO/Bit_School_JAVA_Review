package kr.ac.smu.day08.Homework;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	
	public boolean endOrcontinue() {
		System.out.print("계속 할래?(종료시 quit입력) => ");
		
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine();
		
		if(str.equals("quit")) {
			return false;
		}else if(str.equalsIgnoreCase("y")) {
			return true;
		} else {
			System.out.println("다시 입력 하세요");
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
			System.out.println("1. 정사각형  2. 직사각형  3. 삼각형  4. 원");
			System.out.print("선택 : ");

			type = sc.nextInt();
			sc.nextLine();
			
			Shape sh = null;  //묵시적 형변환.
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
				System.out.println("잘못 입력 하였습니다.");
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
