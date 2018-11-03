package kr.ac.smu.day06;

class Plane {
	
	String name;
	String company;
	
	Plane() {
		System.out.println("디폴트 생성자 ");
	}
	
	Plane(String name) {
		System.out.println("매개변수 1개인 생성자");
	}
	
	Plane(String name, String company) {
		System.out.println("매개변수 2개인 생성자");
	}
	
	public void plane() {
		System.out.println("메소드 함수 호출...");
	}
}

public class ConstructorMain {

	public static void main(String[] args) {
		
		Plane a = new Plane();
		a.plane();
		Plane b = new Plane("A380");
		Plane c = new Plane("A380", "Airbus");
		
	}
}
