package kr.ac.smu.day08.Homework;

public class Square extends Rectangle{

	public Square(int width) {
		super(width, width);
	}
	
	@Override
	public void printArea() {
		System.out.println("�Ѻ��� ���̰� " + getX() + "�� ���簢���� ���̴� " + getArea() + "�Դϴ�.");
	}
}
