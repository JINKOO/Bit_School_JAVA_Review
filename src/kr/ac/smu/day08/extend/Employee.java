package kr.ac.smu.day08.extend;

public class Employee {
	
	private int num;
	private String name;
	private int money;
	private String grade;
	
	
	public Employee(int num, String name, int money, String grade) {

		this.num = num;
		this.name = name;
		this.money = money;
		this.grade = grade;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void info() {
		System.out.println("Super class�� info()");
		System.out.println("��� ��ȣ : " + num);
		System.out.println("��� �̸� : " + name);
		System.out.println("��� ���� : " + money);
		System.out.println("��� ���� : " + grade);
		System.out.println();
	}
}
