package kr.ac.smu.day07.exam;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int num1 = c.getNum();
		int num2 = c.getNum();
		
		c.add(num1, num2);
		c.subtract(num1, num2);
		c.multiple(num1, num2);
		c.divide(num1, num2);
	}
}
