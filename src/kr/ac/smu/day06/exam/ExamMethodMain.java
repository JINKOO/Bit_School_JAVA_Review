package kr.ac.smu.day06.exam;

/* #1
 * ������ �Է� : 1
 * ������ �Է� : 10
 * 
 * 1~10�� �� : 55
 *
 *======================
 * #2.
 * 1~100������ 10�� �߻�.
 *
 *======================
 * #3
 * 1~100 ������ size�� ����.
 *
 *======================
 * #4
 * 1~max������ size�� ���.
 */

public class ExamMethodMain {

	public static void main(String[] args) {
		
		ExamMethod m = new ExamMethod();
		System.out.println("#1.");
		int num1 = m.getNum();
		int num2 = m.getNum();
		
		m.printSum(num1, num2);
		System.out.println("=====================");
		
		System.out.println("#2.");
		int[] mArr = m.getArray();
		m.showArray(mArr);
		System.out.println("=====================");
		
		System.out.println("#3.");
		int size = m.getNum();
		mArr = m.getArray(size);
		m.showArray(mArr);
		System.out.println("=====================");
		
		System.out.println("#4.");
		int max = m.getNum();
		mArr = m.getArray(max, size);
		m.showArray(mArr);
		
		
		
	}
}
