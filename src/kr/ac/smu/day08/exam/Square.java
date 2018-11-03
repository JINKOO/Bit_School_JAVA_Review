package kr.ac.smu.day08.exam;

public class Square extends Shape {

	public Square() {
		this.num = getNum();
	}
	
	public void print() {
		System.out.println("정사각형을 선택하였습니다.");
	}

	@Override
	public double getArea() {
		double area = num * num;
		return area;
	}

	@Override
	public void printArea() {
		System.out.println("한 변의 길이가 " + num + "인 정사각형의 넓이는 : " + getArea() + "입니다.");
		
	}
}
