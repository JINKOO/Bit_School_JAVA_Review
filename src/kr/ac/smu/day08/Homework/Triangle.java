package kr.ac.smu.day08.Homework;

public class Triangle extends Shape{

	public Triangle(int width, int height) {
		super(width, height);
		setArea(width * height / 2.);
	}
	
	@Override
	public void printArea() {
		System.out.println("�غ��� " + getX() + ", ���̰� " + getY() + "�� �ﰢ���� ���̴� " + getArea() + "�Դϴ�.");
		
	}

}
