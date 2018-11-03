package kr.ac.smu.day07;

public class Employee {

	private String name; //사원명
	static int employeeCount; //총 사원 수
	
	public Employee(String name) {
		
		this.name = name;
		Employee.employeeCount++;
		System.out.println(name + "사원이 입사했습니다.");
		System.out.println("지금까지 입사한 총 사원수 : " + Employee.employeeCount);
		
	}
	
	public static void empCount() {
		System.out.println("입사한 총 사원수 : " + Employee.employeeCount);
	}
	
	public void info() {
		System.out.println(name);
	}
}
