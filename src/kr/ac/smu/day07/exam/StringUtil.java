package kr.ac.smu.day07.exam;

//import java.util.Scanner;

public class StringUtil {
	//
	// /**
	// * �Ѱ��� ������ �Է� �޴� �޼ҵ�.
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
	// * �Ѱ��� ���ڸ� �Է� �޴� �޼ҵ�.
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
	// * �Ѱ��� ���ڿ� �Է� �޴� �޼ҵ�.
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
	 * �ϳ��� ���ڸ� �Է� �޾� �ش� ���ڰ� �빮���̸� true��ȯ�ϴ� �޼ҵ�.
	 * 
	 * @param c
	 * @return �Է¹��� ���ڰ� �빮���̸� true ����.
	 */
	public boolean isUpperChar(char c) {

		if (c >= 'A' && c <= 'Z')
			return true;
		else
			return false;
	}

	/**
	 * �ϳ��� ���ڸ� �Է� �޾� �ش� ���ڰ� �ҹ����̸� true�� ��ȯ�ϴ� �޼ҵ�.
	 * 
	 * @param c
	 *            char��
	 * @return �Է� ���� ���ڰ� �ҹ����̸� true����.
	 */
	public boolean isLowerChar(char c) {

		if (c >= 'a' && c <= 'z')
			return true;
		else
			return false;
	}

	/**
	 * �� ���� ����(����)�� �Է� �޾� ū ���� ��ȯ �ϴ� �޼ҵ�.
	 * 
	 * @param i
	 *            ����ڷ� ���� �Է�.
	 * @param j
	 *            ����ڷ� ���� �Է�.
	 * @return int i, int j �� ū ���� ����.
	 */
	public int max(int i, int j) {

		if (i > j)
			return i;
		else
			return j;
	}

	/**
	 * �� ���� ����(����)�� �Է� �޾� ���� ���� ��ȯ �ϴ� �޼ҵ�.
	 * 
	 * @param i
	 *            ����ڷ� ���� �Է�.
	 * @param j
	 *            ����ڷ� ���� �Է�.
	 * @return int i, int j �� ���� ���� ����.
	 */
	public int min(int i, int j) {

		if (i < j)
			return i;
		else
			return j;
	}

	/**
	 * �Է� ���� ���ڿ� �Ųٷ� ��ȯ�ϴ� �޼ҵ�.
	 * @param str
	 * @return
	 * �Ųٷ� ��ȯ�� char�� �迭 ����.
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
	 * ���ڿ��� ��� �빮�ڷ� ��ȯ.
	 * @param str
	 * @return 
	 * ��ȯ�� char�� �迭 ����;
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
	 * ���ڿ��� ��� �ҹ��ڷ� ��ȯ
	 * @param 
	 * @return
	 * ��ȯ�� char�� �迭 ����.
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
	 * �迭�� ����ϴ� �޼ҵ�.
	 * @param cArr
	 * 
	 */
	public void showArr(char[] cArr) {
		for (char ch : cArr) {
			System.out.print(ch);
		}
	}
	
	/**
	 * ������ �����ϴ� �� ����ϴ� �޼ҵ�.
	 */
	public void printDivide() {
		System.out.println("========================");
	}
}
