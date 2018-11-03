package kr.ac.smu.day09.cast;

public class Parent {

	private String name = "부모";
	
	public static Parent getInstance() {
		
		return new Child01();
		//리턴 타입을 묵시적 형변환으로 한다.
		//메인 함수에서 여러곳을 바꾸는 것을 여기서는 리턴 타입의 변수만 바꾸면 되.
	}
	
	public void info() {
		System.out.println("name : " + name);
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}
}
