package kr.ac.smu.day08.extend;

//사원 관리 목록.
public class Manager extends Employee {

	private Employee[] empList;
	

	public Manager(int num, String name, int money, String grade, Employee[] empList) {
		super(num, name, money, grade);
		this.empList = empList;	
	}
	
	public void info() {
		System.out.println("오버라이드");
		super.info();
		
		System.out.println("\t<사원 관리 목록>");
		for(Employee e : empList) {
			e.info();
		}
	}
}
	
