package kr.ac.smu.day08.exam;

public class Triangle extends Shape{

	private int num2;
	
	public Triangle() {
		this.num = getNum();
		this.num2 = getNum();
	}
	
	public void print() {
		System.out.println("삼각형을 선택하였습니다.");
	}

	@Override
	public double getArea() {
		double area;
		area = ((double)num * num2) / 2;
		return area;
	}

	@Override
	public void printArea() {
		
		System.out.println("밑변" + num + ", 높이 " + num2 + "일때의 삼각형의 넓이는 " +getArea() + "입니다");
		
	}
}
