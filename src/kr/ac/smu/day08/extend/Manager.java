package kr.ac.smu.day08.extend;

//��� ���� ���.
public class Manager extends Employee {

	private Employee[] empList;
	

	public Manager(int num, String name, int money, String grade, Employee[] empList) {
		super(num, name, money, grade);
		this.empList = empList;	
	}
	
	public void info() {
		System.out.println("�������̵�");
		super.info();
		
		System.out.println("\t<��� ���� ���>");
		for(Employee e : empList) {
			e.info();
		}
	}
}
	
