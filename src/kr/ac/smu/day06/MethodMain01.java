package kr.ac.smu.day06;


public class MethodMain01 {

	public static void main(String[] args) {
		
		//�⺻������ �ٸ� class�� �޼ҵ带 ������ �ش� �޼ҵ尡 �ִ� class�� ��ü�� �������Ѵ�.
		Method m1 = new Method();
		
		m1.call("HI");
		m1.call(10);
		m1.call('A');   //charŸ���� �Ű������� �ϳ������� call�޼ҵ尡 �����Ƿ� ��������ȯ�� �Ͼ��. 
		m1.call(10,'a');
		
	}
}
