package kr.ac.smu.day09.cast;

public class Child02 extends Parent {

	String name = "자식2";
	int age = 12;
	
	public void play() {
		System.out.println("나는 놉니다.");
	}
	
	public void sing() {
		System.out.println("나는 노래를 합니다.");
	}
	
	public void info() {
		System.out.println("두번째 자식에서 오버라이딩된 info()...");
	}
}
