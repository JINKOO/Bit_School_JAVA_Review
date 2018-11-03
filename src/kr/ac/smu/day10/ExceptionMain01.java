package kr.ac.smu.day10;

import java.util.Random;

/*
 * 예외 처리.
 * 
 * 문제발생 2가지 : 1.예외  2.에러(에러는 심각한 오류).
 * 
 * 보통 예외처리는 사용자가 if-else문을 사용하여 처리한다.
 * if-else문을 사용하면 되지..왜 굳이 try-catch를 사용하는 걸까
 * =>사용자가 예측하지 못하는 예외가 발생할 수 있다.(유연한 대처의 필요성)
 * 또한 예외가 발생했다 하더라도 그 부분때문에 프로그램이 강제로 종료되는 것을 막을 수 있다.
 * 보통 에러, 예외가 발생하면 프로그램은 강제 종료된다.
 * 하지만 나는 예외가 발생하더라도 그 다음의 코드는 실행 하고 싶다.
 * 
 * 사용되는 5가지 키워드
 * 
 * 1.try
 * 2.catch
 * 3.finally
 * 4.throws
 * 5.throw
 * 
 * 1,2,3번 : 사용자가 예외를 직접 처리한다.
 * =>예외 직접 처리
 * try - 예외 발생할 수 있는 부분을 {}로 묶는다.
 * catch - 예외 처리하는 부분.
 *         catch가 없다면 프로그램은 예외부분에서 바로 강제종료된다.
 * finally - 예외상관 없이 무조건 실행 되는 부분.
 * 
 * 
 * 4번 : 호출한 메소드에게 맡긴다.
 * =>예외 간접처리
 * 
 * throws
 * 보통 설계할때 많이 쓰인다.(설계하는 class에 '이 메소드는 예외처리가 필요합니다.')
 * 메소드 내에서 예외를 직접 처리하는 것이 아니라
 * 자신을 호출한 메소드에서 예외처리를 떠넘기는 역할하는 키워드.(간접 처리)
 * =>예외처리를 통합적으로 관리하는 class를 만든다.
 * 
 * abstract class AAA {
 * 
 *    void info() {
 *    
 *    }
 * 
 *    abstract void read();
 *    abstract void write();    
 *      read와 write에서 예외가 발생할 거 같아..
 *      그런데 이렇게 쓰면 오버라이딩시 try-catch를 쓸지 안쓸지도 모르잖아.
 *      다음과 같이 쓰면 되.
 *      
 *    abstract void read() throws ArithmeticException;
 *    abstract void write() throws NullPointException;
 *    //이 두가지 메소드는 반드시 예외처리를 해줄것을 명시한다.
 *    
 *    Exception class가 존재한다.
 *    이 class안에 ArithmeticException, NullPointException
 *    
 *    통합적으로 처리
 *    abstract public void print() throws Exception;
 *  
 * }
 * 
 * 5번 : 사용자 정의 예외처리.
 * throw
 * JVM이 봤을때 얘는 예외가 아닌데 
 * 사용자가 예외로 지정하고 싶다.
 * ex) 어떤 정수가 5보다 크면 예외다.(JVM입장에서는 얘는 예외가 아닌데..)
 * 
 */

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		
		int num = r.nextInt(2);
		System.out.println("추출된 정수 : " + num);
		System.out.println(10/num); //num이 0이면 밑에는 실행안되고 바로 종료.
		System.out.println("main end...");	
	}
}
