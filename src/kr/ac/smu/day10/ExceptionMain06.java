package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * throws 키워드 이용.
 * 
 */

abstract class Parent {
	
	abstract void print();
	abstract void read() throws Exception;
	/*
	 * read() 메소드는 무조건 예외처리가 필요
	 * 앞에서 설명했을때는 throws키워드 다음에 예외타입을 적어주었는데
	 * 모든 예외타입의 부모class가 Exception이므로 이걸 써도 된다.
	 * 이유:묵시 형변환.
	 * 
	 */
}

class Child extends Parent {

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void read() throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * 여기서 예외 처리를 하는 것이아니라
		 * 얘를 호출한 메소드에서 해준다.
		 * (너한테 넘기겠어! 나는 하기 싫거든)
		 * 
		 */
	}
	
}

public class ExceptionMain06 {

	static void a() {
		System.out.println("a() 호출...");
		
		try {
			FileReader fr = new FileReader("a.txt");
		}catch(FileNotFoundException e) {
			e.getMessage();
		}
		
		/*
		 * a()에서 직접 예외처리.
		 * throws 키워드 사용하지 않음.
		 * 
		 */
	}
	
	static void b() throws NullPointerException, ArithmeticException {
		System.out.println("b() 호출...");
		
		String str = null;
		System.out.println("문자열의 길이 : " + str.length());
		
		System.out.println(10 / 0);
		

		System.out.println("!!!"); //

		/*
		 * b()를 호출한 메소드 = main메소드
		 * 따라서 throws키워드가 있으므로 main에서 b()를 호출할때 예외처리 해준다.
		 * 72번째 줄은 실행 여부 판단.
		 * 예외가 발생하면 무조건 catch로 이동.
		 */
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		a();
		try {
			b();
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException 예외 처리");
			ne.getMessage();
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException 예외 처리 ");
			ae.getMessage();
		}
		System.out.println("main end...");
	}
}
