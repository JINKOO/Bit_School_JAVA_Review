package kr.ac.smu.day07;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("������");
		Employee e2 = new Employee("���ؿ�");
		Employee e3 = new Employee("�輱��");
		
		e1.info();
		e2.info();
		e3.info();
		
		Employee.empCount();
	}
}
