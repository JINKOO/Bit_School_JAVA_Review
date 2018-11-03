package kr.ac.smu.day08.exam;

import java.util.Random;
import java.util.Scanner;

public abstract class Shape {

	protected int num;
	private String str;
	
	public abstract void print();
	public abstract double getArea();
	public abstract void printArea();
	
	public int getNum() {
		
		Random r = new Random();
		num = r.nextInt(10) + 1;
		
		return num;
	}
	
	public void loop() {
		
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		
		System.out.print("����ҷ�?(����� quit�Է�) => ");
		str = sc.nextLine();
		
		if(str.equalsIgnoreCase("y")) {
			System.out.println();
			num = menu.choiceMenu();
			menu.process(num);
		}else if(str.equals("quit")){
			System.exit(0);
		}else {
			System.out.println("�߸� �Է� �Ͽ����ϴ�. �ٽ� �Է� ���ּ���");
			System.out.println();
			loop();
		}
	}
}
