package kr.ac.smu.day08;

public class Manager01 extends Employee01{

//	int num;
//	String name;
//	int money;
//	String grade;        //������� ��� ������ �ȴ�.
	Employee01[] empList;
	
	public Manager01() {
		
	}
	
	public Manager01(int num, String name, int money, String grade, Employee01[] empList) {
		
		this.num = num;
		this.name = name;
		this.money = money;
		this.grade = grade;
		this.empList = empList;
		
	}
	
	public void info() {
		
		System.out.println("��� ��ȣ : " + num);
		System.out.println("��� �̸� : " + name);
		System.out.println("��� ���� : " + money);
		System.out.println("��� ��å : " + grade);
		System.out.println();
		
		System.out.println("\t <��� ���� ���>");
		for(Employee01 e : empList) {
			e.info();
		}
		
		
	}
}
