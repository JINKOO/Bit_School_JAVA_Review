package kr.ac.smu.day08.exam;

public class Circle extends Shape {

	private final double PI = 3.14;
	
	public Circle() {
		this.num = getNum();
	}
	
	@Override
	public void print() {
		System.out.println("���� �����Ͽ����ϴ�.");
	}
	
	@Override
	public double getArea() {
		double area;
		area = num * num * PI;
		
		return area;
	}
	
	@Override
	public void printArea() {
		System.out.println("�������� ���̰� " + num +"�� ���� ���̴� " + getArea() + "�Դϴ�.");
	}
	
}
