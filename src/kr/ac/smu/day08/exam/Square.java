package kr.ac.smu.day08.exam;

public class Square extends Shape {

	public Square() {
		this.num = getNum();
	}
	
	public void print() {
		System.out.println("���簢���� �����Ͽ����ϴ�.");
	}

	@Override
	public double getArea() {
		double area = num * num;
		return area;
	}

	@Override
	public void printArea() {
		System.out.println("�� ���� ���̰� " + num + "�� ���簢���� ���̴� : " + getArea() + "�Դϴ�.");
		
	}
}
