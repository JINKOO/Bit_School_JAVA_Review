package kr.ac.smu.day08.Homework;

public class Rectangle extends Shape {

	public Rectangle(int width, int height) {
		super(width, height);
		setArea(width * height);
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("���� ���̰� " + getX() + ", ���� ���̰� " + getY() + "�� ���簢���� ���̴� " + getArea() + "�Դϴ�.");
	}
}
