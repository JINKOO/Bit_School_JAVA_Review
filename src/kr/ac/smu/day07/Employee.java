package kr.ac.smu.day07;

public class Employee {

	private String name; //�����
	static int employeeCount; //�� ��� ��
	
	public Employee(String name) {
		
		this.name = name;
		Employee.employeeCount++;
		System.out.println(name + "����� �Ի��߽��ϴ�.");
		System.out.println("���ݱ��� �Ի��� �� ����� : " + Employee.employeeCount);
		
	}
	
	public static void empCount() {
		System.out.println("�Ի��� �� ����� : " + Employee.employeeCount);
	}
	
	public void info() {
		System.out.println(name);
	}
}
