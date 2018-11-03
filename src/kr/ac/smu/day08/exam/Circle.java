package kr.ac.smu.day08.exam;

public class Circle extends Shape {

	private final double PI = 3.14;
	
	public Circle() {
		this.num = getNum();
	}
	
	@Override
	public void print() {
		System.out.println("원을 선택하였습니다.");
	}
	
	@Override
	public double getArea() {
		double area;
		area = num * num * PI;
		
		return area;
	}
	
	@Override
	public void printArea() {
		System.out.println("반지름의 길이가 " + num +"인 원의 넓이는 " + getArea() + "입니다.");
	}
	
}
