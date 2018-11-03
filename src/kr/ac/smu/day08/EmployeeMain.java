package kr.ac.smu.day08;

public class EmployeeMain {

	//상속 받지 않고 실행.
	public static void main(String[] args) {
		
		Employee01 e1 = new Employee01(1, "고진권", 5_500, "팀장");
		Employee01 e2 = new Employee01(2, "김준원", 4_500, "과장");
		Employee01 e3 = new Employee01(3, "우상호", 5_500, "신입");
		Employee01 e4 = new Employee01(4, "김선민", 3_500, "대리");
		Employee01 e5 = new Employee01(5, "오경필", 5_500, "과장");
		
		e1.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee01[] empList = {e1, e3, e5};
		
		Manager01 m1 = new Manager01(100, "홍길동", 45_000, "사장", empList);
		m1.info();
		
	}
}
