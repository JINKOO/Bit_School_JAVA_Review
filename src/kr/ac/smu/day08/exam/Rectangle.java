package kr.ac.smu.day08.exam;

public class Rectangle extends Shape {

	private int num2;
	
	public Rectangle() {
		this.num = getNum();
		this.num2 = getNum();
	}
	
	@Override
	public void print() {
		System.out.println("직사각형을 선택하였습니다.");
	}


	@Override
	public double getArea() {
		double area;
		area = num * num2;
		return area;
	}


	@Override
	public void printArea() {
		System.out.println("가로" + num + ", " + "세로 " + num2 + "일때의 직사각형의 넓이는" + getArea() + "입니다.");
	}
}
