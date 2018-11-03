package kr.ac.smu.day08.extend;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "고진권", 10_000, "사장");
		Employee e2 = new Employee(2, "김준원", 8_000, "대리");
		Employee e3 = new Employee(3, "우상호", 8_000, "팀장");
		
		//Super Class의 info()에서 실행.
//		e1.info();
//		e2.info();
//		e3.info();
//		
		Employee[] empList = {e1,e2,e3};
		
		Manager m1 = new Manager(100,"홍길동",10_000,"사장",empList);
		m1.info();
	}
}
