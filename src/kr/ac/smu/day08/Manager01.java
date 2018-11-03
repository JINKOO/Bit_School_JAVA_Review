package kr.ac.smu.day08;

public class Manager01 extends Employee01{

//	int num;
//	String name;
//	int money;
//	String grade;        //여기까지 상속 받으면 된다.
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
		
		System.out.println("사원 번호 : " + num);
		System.out.println("사원 이름 : " + name);
		System.out.println("사원 연봉 : " + money);
		System.out.println("사원 직책 : " + grade);
		System.out.println();
		
		System.out.println("\t <사원 관리 목록>");
		for(Employee01 e : empList) {
			e.info();
		}
		
		
	}
}
