package kr.ac.smu.day08.extend;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "������", 10_000, "����");
		Employee e2 = new Employee(2, "���ؿ�", 8_000, "�븮");
		Employee e3 = new Employee(3, "���ȣ", 8_000, "����");
		
		//Super Class�� info()���� ����.
//		e1.info();
//		e2.info();
//		e3.info();
//		
		Employee[] empList = {e1,e2,e3};
		
		Manager m1 = new Manager(100,"ȫ�浿",10_000,"����",empList);
		m1.info();
	}
}
