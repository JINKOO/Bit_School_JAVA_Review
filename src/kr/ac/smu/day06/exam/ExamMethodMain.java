package kr.ac.smu.day06.exam;

/* #1
 * 정수를 입력 : 1
 * 정수를 입력 : 10
 * 
 * 1~10총 합 : 55
 *
 *======================
 * #2.
 * 1~100난수를 10개 발생.
 *
 *======================
 * #3
 * 1~100 난수를 size개 추출.
 *
 *======================
 * #4
 * 1~max난수를 size개 출력.
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
