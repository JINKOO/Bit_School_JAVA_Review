package kr.ac.smu.day08.Homework;

public class Triangle extends Shape{

	public Triangle(int width, int height) {
		super(width, height);
		setArea(width * height / 2.);
	}
	
	@Override
	public void printArea() {
		System.out.println("밑변이 " + getX() + ", 높이가 " + getY() + "인 삼각형의 넓이는 " + getArea() + "입니다.");
		
	}

}
