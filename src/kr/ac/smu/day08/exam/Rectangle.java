package kr.ac.smu.day08.exam;

public class Rectangle extends Shape {

	private int num2;
	
	public Rectangle() {
		this.num = getNum();
		this.num2 = getNum();
	}
	
	@Override
	public void print() {
		System.out.println("���簢���� �����Ͽ����ϴ�.");
	}


	@Override
	public double getArea() {
		double area;
		area = num * num2;
		return area;
	}


	@Override
	public void printArea() {
		System.out.println("����" + num + ", " + "���� " + num2 + "�϶��� ���簢���� ���̴�" + getArea() + "�Դϴ�.");
	}
}
