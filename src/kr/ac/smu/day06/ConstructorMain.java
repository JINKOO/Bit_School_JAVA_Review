package kr.ac.smu.day06;

class Plane {
	
	String name;
	String company;
	
	Plane() {
		System.out.println("����Ʈ ������ ");
	}
	
	Plane(String name) {
		System.out.println("�Ű����� 1���� ������");
	}
	
	Plane(String name, String company) {
		System.out.println("�Ű����� 2���� ������");
	}
	
	public void plane() {
		System.out.println("�޼ҵ� �Լ� ȣ��...");
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
