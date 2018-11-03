package kr.ac.smu.day13;

class Parent {

	void print() {
		System.out.println("안녕");
	}
}

class Child01 extends Parent{
	
	void print() {
		System.out.println("오양택");
	}
}

class Child02 extends Parent{
	
	void print() {
		System.out.println("고진권");
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
