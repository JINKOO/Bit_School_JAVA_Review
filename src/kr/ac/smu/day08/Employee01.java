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
		
		System.out.println("사원 번호 : " + num);
		System.out.println("사원 이름 : " + name);
		System.out.println("사원 연봉 : " + money);
		System.out.println("사원 직책 : " + grade);
		System.out.println("==");
		
	}
}
