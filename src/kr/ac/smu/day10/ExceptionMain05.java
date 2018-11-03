package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

/*
 * 
 * 예외가 타입이 다르게 여러개 발생 할 수 도 있다.
 * catch block을 여러개 쓸 수 있다.
 * 
 * 
 */
public class ExceptionMain05 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		try {
			
			FileReader fr = new FileReader("a.txt");
			//이것만 실행..??
			String str = "abc";
			System.out.println("4번째 문자 : " + str.charAt(3));
			
			Random r = null;
			System.out.println("추출된 정수 : " + r.nextInt(2));
		
		} catch (Exception e) { //Exception이 부모 class이다.
			e.printStackTrace();
		}
		
//		}catch (FileNotFoundException fe) {
//			fe.printStackTrace();
//		}catch (StringIndexOutOfBoundsException se) {
//			se.printStackTrace();
//		}catch (NullPointerException ne) {
//			ne.printStackTrace();
//		}
		
		System.out.println("main end...");
	}
}
