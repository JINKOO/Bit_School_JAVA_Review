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
		System.out.println("Super class의 info()");
		System.out.println("사원 번호 : " + num);
		System.out.println("사원 이름 : " + name);
		System.out.println("사원 연봉 : " + money);
		System.out.println("사원 직급 : " + grade);
		System.out.println();
	}
}
