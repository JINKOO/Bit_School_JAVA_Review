package kr.ac.smu.day08.Homework;

public abstract class Shape {

	private int x;
	private int y;
	private double area;
	// x y�� ���� ����, �������� �� �� �ִ�.

	public Shape(int x) {
		this.x = x;
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return this.area;
	}

	// public abstract void printType();
	public abstract void printArea();

}
