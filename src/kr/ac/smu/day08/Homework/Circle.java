package kr.ac.smu.day08.Homework;

public class Circle extends Shape{

	public Circle(int r) {
		super(r);
		setArea(r * r * 3.14);
	}
	
	@Override
	public void printArea() {
		
		System.out.println("���� �����Ͽ����ϴ�.");
		System.out.println("�������� " + getX() + "�� ���� ���̴� " + getArea() + "�Դϴ�.");
	
	}

}
