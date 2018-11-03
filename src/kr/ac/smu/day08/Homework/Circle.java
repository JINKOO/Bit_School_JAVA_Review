package kr.ac.smu.day08.Homework;

public class Circle extends Shape{

	public Circle(int r) {
		super(r);
		setArea(r * r * 3.14);
	}
	
	@Override
	public void printArea() {
		
		System.out.println("원을 선택하였습니다.");
		System.out.println("반지름이 " + getX() + "인 원의 넓이는 " + getArea() + "입니다.");
	
	}

}
