package kr.ac.smu.day07.exam;

//import java.util.Scanner;

public class StringUtil {
	//
	// /**
	// * 한개의 정수를 입력 받는 메소드.
	// * @return
	// */
	// public int getNum() {
	// Scanner sc = new Scanner(System.in);
	// int num = sc.nextInt();
	// sc.nextLine();
	//
	// return num;
	// }
	//
	// /**
	// * 한개의 문자를 입력 받는 메소드.
	// * @return
	// */
	// public char getChar() {
	// Scanner sc = new Scanner(System.in);
	// char ch = sc.nextLine().charAt(0);
	//
	// return ch;
	// }
	//
	// /**
	// * 한개의 문자열 입력 받는 메소드.
	// * @return
	// */
	// public String getString() {
	// Scanner sc = new Scanner(System.in);
	// String str = sc.next();
	//
	// return str;
	// }
	//
	/**
	 * 하나의 문자를 입력 받아 해당 문자가 대문자이면 true반환하는 메소드.
	 * 
	 * @param c
	 * @return 입력받은 문자가 대문자이면 true 리턴.
	 */
	public boolean isUpperChar(char c) {

		if (c >= 'A' && c <= 'Z')
			return true;
		else
			return false;
	}

	/**
	 * 하나의 문자를 입력 받아 해당 문자가 소문자이면 true를 반환하는 메소드.
	 * 
	 * @param c
	 *            char형
	 * @return 입력 받은 문자가 소문자이면 true리턴.
	 */
	public boolean isLowerChar(char c) {

		if (c >= 'a' && c <= 'z')
			return true;
		else
			return false;
	}

	/**
	 * 두 개의 숫자(정수)를 입력 받아 큰 수를 반환 하는 메소드.
	 * 
	 * @param i
	 *            사용자로 부터 입력.
	 * @param j
	 *            사용자로 부터 입력.
	 * @return int i, int j 중 큰 수를 리턴.
	 */
	public int max(int i, int j) {

		if (i > j)
			return i;
		else
			return j;
	}

	/**
	 * 두 개의 숫자(정수)를 입력 받아 작은 수를 반환 하는 메소드.
	 * 
	 * @param i
	 *            사용자로 부터 입력.
	 * @param j
	 *            사용자로 부터 입력.
	 * @return int i, int j 중 작은 수를 리턴.
	 */
	public int min(int i, int j) {

		if (i < j)
			return i;
		else
			return j;
	}

	/**
	 * 입력 받은 문자열 거꾸로 변환하는 메소드.
	 * @param str
	 * @return
	 * 거꾸로 변환된 char형 배열 리턴.
	 */
	public char[] reverseString(String str) {

//		StringBuffer reStr = new StringBuffer();
//		for(int i = str.length(); i>=0; i--) {
//			reStr.append(str.charAt(i));
//		}
//		return reStr.toString()
		char[] cArr = new char[str.length()];
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt((str.length() - 1) - i);
		}
		return cArr;
	}

	/**
	 * 문자열을 모두 대문자로 변환.
	 * @param str
	 * @return 
	 * 변환된 char형 배열 리턴;
	 */
	public char[] toUpperString(String str) {

		char[] cArr = new char[str.length()];
		int num = 'a' - 'A';
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt(i);
			if (cArr[i] >= 'a' && cArr[i] <= 'z') {
				cArr[i] = (char) (cArr[i] - num); // cArr[i] = cArr[i] + 32 ??;
			}
		}
		return cArr;
	}

	/**
	 * 문자열을 모두 소문자로 변환
	 * @param 
	 * @return
	 * 변환된 char형 배열 리턴.
	 */
	public String toLowerString(String str) {

		char[] cArr = new char[str.length()];
		int num = 'a' - 'A';
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt(i);
			if (cArr[i] >= 'A' && cArr[i] <= 'Z') {
				cArr[i] = (char) (cArr[i] + num);
			}
		}
		return String.valueOf(cArr);
	}

	/**
	 * 배열을 출력하는 메소드.
	 * @param cArr
	 * 
	 */
	public void showArr(char[] cArr) {
		for (char ch : cArr) {
			System.out.print(ch);
		}
	}
	
	/**
	 * 문제를 구분하는 행 출력하는 메소드.
	 */
	public void printDivide() {
		System.out.println("========================");
	}
}
