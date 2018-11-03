package kr.ac.smu.day08.Homework;

public class Square extends Rectangle{

	public Square(int width) {
		super(width, width);
	}
	
	@Override
	public void printArea() {
		System.out.println("한변의 길이가 " + getX() + "인 정사각형의 넓이는 " + getArea() + "입니다.");
	}
}
