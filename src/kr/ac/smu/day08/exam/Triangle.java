package kr.ac.smu.day08.exam;

public class Triangle extends Shape{

	private int num2;
	
	public Triangle() {
		this.num = getNum();
		this.num2 = getNum();
	}
	
	public void print() {
		System.out.println("�ﰢ���� �����Ͽ����ϴ�.");
	}

	@Override
	public double getArea() {
		double area;
		area = ((double)num * num2) / 2;
		return area;
	}

	@Override
	public void printArea() {
		
		System.out.println("�غ�" + num + ", ���� " + num2 + "�϶��� �ﰢ���� ���̴� " +getArea() + "�Դϴ�");
		
	}
}
