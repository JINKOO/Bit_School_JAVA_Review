package kr.ac.smu.day09.cast;

public class Parent {

	private String name = "�θ�";
	
	public static Parent getInstance() {
		
		return new Child01();
		//���� Ÿ���� ������ ����ȯ���� �Ѵ�.
		//���� �Լ����� �������� �ٲٴ� ���� ���⼭�� ���� Ÿ���� ������ �ٲٸ� ��.
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
