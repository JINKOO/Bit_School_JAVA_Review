package kr.ac.smu.day08;

public class Employee01 {

	int num;
	String name;
	int money;
	String grade;
	
	public Employee01() {
		
	}
	
	public Employee01(int num, String name, int money, String grade) {
		
		this.num = num;
		this.name = name;
		this.money = money;
		this.grade = grade;
	}
	
	public void info() {
		
		System.out.println("��� ��ȣ : " + num);
		System.out.println("��� �̸� : " + name);
		System.out.println("��� ���� : " + money);
		System.out.println("��� ��å : " + grade);
		System.out.println("==");
		
	}
}
