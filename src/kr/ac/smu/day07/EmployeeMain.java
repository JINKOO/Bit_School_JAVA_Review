package kr.ac.smu.day07;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("°íÁø±Ç");
		Employee e2 = new Employee("±èÁØ¿ø");
		Employee e3 = new Employee("±è¼±¹Î");
		
		e1.info();
		e2.info();
		e3.info();
		
		Employee.empCount();
	}
}
