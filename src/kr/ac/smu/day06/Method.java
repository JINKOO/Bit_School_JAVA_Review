package kr.ac.smu.day06;

/*
 * 메소드 오버로딩
 * 
 * 동일한 메소드 명 존재가능
 *   자바에서는 메소드명 + 매개변수로 메소드를 구분한다.
 *   C언어에서는 메소드명으로 구분.
 *   리턴 타입만 다르다고 오버로딩 발생 하지 않는다.(리턴 타입은 상관 없다.)
 *  
 * 매개 변수만 다르고 목적이 같은 행동을 구현할때 쓸 수 있다.
 * 묵시 형변환이 일어난다. 
 * 
 */

public class Method {
	
	public void call(int num) {
		System.out.println("int형 매개 변수 가지는 call() : " + num );
	}
	
	public void call(double num) {
		System.out.println("double형 매개 변수 가지는 call() : " + num );
	}
	
	public void call(String a) {
		System.out.println("String클라스형 매개 변수 가지는 call() : " + a);
	}
	
	public void call(int num1, char x) {
		
		for(int i = 0; i<num1; i++) {
			System.out.println("[" + (i+1) + "]" + x);
		}
		System.out.println();
	}
}
