package kr.ac.smu.day10;

import java.util.Random;

/*
 * final 키워드
 * 이용되는 곳 3가지
 * 
 * 1.멤버변수 : 상수
 * 2.메소드 : 오버라이딩 금지.
 * 3.class : 상속 금지.
 * 
 */

/*final*/ class Super {

	private /* final */ int max = 100;

	public Super() {
		this.max = 10;
	}

	public /*final*/ void info() {
		System.out.println("Super class에서 정의한 info()...");
	}
}


class Sub extends Super {
	
	@Override
	public void info() {
		System.out.println("Sub class에서 정의한 info()...");
	}
}

class MyRandom extends Random{

	@Override
	public int nextInt() {
		return super.nextInt() + 1;
	}
	
	/*
	 * 앞서 말한 방법이야.
	 * 뭔가 좀 독특하지 않아..?? 아니야..??
	 * 
	 * 잘 보면 
	 * MyRandom이라는 class는 내가(사용자) 정의한 class야.
	 * 근데 얘가 Random class를 상속받네???
	 * Random class => 우리가 이제껏 난수를 발생 시킬때 사용했던 class! 자바에서 제공해주잖아..
	 * 여기 Random class안에는 nextInt()라는 메소드가 있어.
	 * 
	 * 자 상속관계일때 오버라이딩이 뭐라고??
	 * =>메소드 재정의!
	 * 오버라이딩을 통해서 내가 nextInt()를 재정의하는 거야.
	 * 여기선 
	 * 앞에서 말한+1을 붙이기 귀찮으니까 리턴 값에 +1을 해주는 방식의 재정의를 한것이야.
	 * 
	 * 
	 * 이렇듯 기존 API를 상속받아서 
	 * 사용자가 그 API에 있는 메소드를 다시 재정의 할 수 있어!
	 *  
	 * 단 String class는 특이하게 final이여서 
	 * 메소드 오버라이딩을 통한 메소드 재정의 불가해.
	 * 
	 */
	
}


public class FinalMain {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.info();
		
		System.out.println("=======================");
		
		/*
		 * 1-100에서 난수 하나를 추출할거야.
		 * 
		 * 이때까지 해왔던 방식은 다음과 같지.
		 * 
		 */
		
		Random r1 = new Random();
		int num1 = r1.nextInt(100) + 1;
		System.out.println("발생한 난수 : " + num1);
		
		/*
		 * 그런데 보통 프로그램 실행할때 코드에서
		 * 난수 발생은 대부분 1~n까지 사이의 수에서 발생해.
		 * 0~n사이는 별로 없어.
		 * 
		 * 1부터 시작하려면 뭔가 귀찮지 않아..?? (아닌가..)
		 * 무튼 배경은 이렇데..
		 * 그렇다면 +1을 안붙이고 
		 * 1-100사이의 난수를 발생 시키는 코드를 짜보자!
		 * 
		 */

		MyRandom r2 = new MyRandom();
		int num2 = r2.nextInt(100);
		System.out.println("재정의하여 발생시킨 난수 : " + num2);
	}
}
