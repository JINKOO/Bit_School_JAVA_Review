package kr.ac.smu.day07.exam;

public class Homework04 {

	/**
	 * �Է¹��� ���ڿ��� �޾� �Է¹��� ���ڸ� �����ϴ� �޼ҵ�.
	 * 
	 * @param oriStr
	 *            :���� ���ڿ�
	 * @param delChat
	 *            : ���� ���ڿ����� ������ ���� �ϳ�
	 * @return ����� ���ڿ� ����.
	 */

	public static String removeChar(String oriStr, char delChar) {

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < oriStr.length(); i++) {
			if (oriStr.charAt(i) != delChar) {
				sb.append(oriStr.charAt(i));
			}
		}

		String delStr = new String();

		if (oriStr.contains("delChar")) {
			int num = -1;
			while ((num = oriStr.indexOf(delChar, num + 1)) != -1) {
				char c = delStr.charAt(num);
				c = '\u0000';
			}
			return delStr;
		} else {
			System.out.println("�ش� ���ڰ� ���ڿ��� �����ϴ�.");
			return delStr;
		}
	}
}
