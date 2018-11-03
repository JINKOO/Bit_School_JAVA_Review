package kr.ac.smu.day14;
/*
 * Thread 2개 생성 하고
 * thread이름 바꾸는 프로그램.
 *
 * thread 생성 2가지 방법.
 * 
 * 1. Thread class상속 받는다. 
 * 
 * 2. Runnable class 상속 받는다.
 * 
 * 사용자는 thread를 생성하고 thread큐에 넣는 것 까지한다.
 * 수행은 JVM이 알아서 한다.
 * 
 * thread가 무슨일을 하는지는 run()를 오버라이딩 한다.
 * 
 */

//여기서는 2개의 thread가 이름을 바꾸는 기능을 수행한다.
//class가 하나이고 때문에 오버라이딩 된 run()을 실행 하기 때문.
class ThreadName extends Thread {
	
	public ThreadName() {
		super();
	}
	
	public ThreadName(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		System.out.println("수행중인 Thread이름 : " + getName());
		
		 int index = getName().indexOf('-');
		 String str = getName().substring(index);
		 
		 setName("ChangeName" + str);
		 
		 System.out.println("변경된 Thread이름은  : " + getName());
	}
}

public class ThreadMain01 {

	public static void main(String[] args) {	

		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName(); //아직 thread생성 하지 않음.
		
		t1.start(); 
		t2.start(); //
	}
}
