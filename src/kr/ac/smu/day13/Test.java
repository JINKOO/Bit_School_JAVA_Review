package kr.ac.smu.day13;

class Parent {

	void print() {
		System.out.println("�ȳ�");
	}
}

class Child01 extends Parent{
	
	void print() {
		System.out.println("������");
	}
}

class Child02 extends Parent{
	
	void print() {
		System.out.println("������");
	}
}


public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Parent r = new Child01();
		
		p.print();
		r.print();
		
		
	}
}
