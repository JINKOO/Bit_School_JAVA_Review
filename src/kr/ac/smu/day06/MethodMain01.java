package kr.ac.smu.day06;


public class MethodMain01 {

	public static void main(String[] args) {
		
		//기본적으로 다른 class의 메소드를 쓰려면 해당 메소드가 있는 class의 객체를 만들어야한다.
		Method m1 = new Method();
		
		m1.call("HI");
		m1.call(10);
		m1.call('A');   //char타입의 매개변수를 하나가지는 call메소드가 없으므로 묵시형변환이 일어난다. 
		m1.call(10,'a');
		
	}
}
