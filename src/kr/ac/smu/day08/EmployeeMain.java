package kr.ac.smu.day08;

public class EmployeeMain {

	//��� ���� �ʰ� ����.
	public static void main(String[] args) {
		
		Employee01 e1 = new Employee01(1, "������", 5_500, "����");
		Employee01 e2 = new Employee01(2, "���ؿ�", 4_500, "����");
		Employee01 e3 = new Employee01(3, "���ȣ", 5_500, "����");
		Employee01 e4 = new Employee01(4, "�輱��", 3_500, "�븮");
		Employee01 e5 = new Employee01(5, "������", 5_500, "����");
		
		e1.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee01[] empList = {e1, e3, e5};
		
		Manager01 m1 = new Manager01(100, "ȫ�浿", 45_000, "����", empList);
		m1.info();
		
	}
}
