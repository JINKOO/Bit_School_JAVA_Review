package kr.ac.smu.day08.Homework;

public class Rectangle extends Shape {

	public Rectangle(int width, int height) {
		super(width, height);
		setArea(width * height);
	}
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("가로 길이가 " + getX() + ", 세로 길이가 " + getY() + "인 직사각형의 넓이는 " + getArea() + "입니다.");
	}
}
