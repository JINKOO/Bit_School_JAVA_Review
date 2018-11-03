package kr.ac.smu.day11;

/*
 * A class 를 
 * generic의 형태를 쓴 B Class로 바꾼다.
 * 
 */

class A {
	
	private Object obj;
	
	A() {
		
	}
	
	A(Object obj) {
		this.obj = obj;
	}
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
	
	void info() {
		System.out.println("obj : "  + obj);
	}
}
public class GenericMain {

	public static void main(String[] args) {
		
		A a = new A(new String("hello"));
		A a2 = new A(new String("random"));
		
		a.info();
		a2.info();
		
		System.out.println("===============================");
		
		A[] aArr = {a, a2};
		String str = (String)aArr[0].getObj();
		System.out.println("문자열 길이 : " + str.length());
	}
}
