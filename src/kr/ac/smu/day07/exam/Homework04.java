package kr.ac.smu.day07.exam;

public class Homework04 {

	/**
	 * 입력받은 문자열을 받아 입력받은 문자를 삭제하는 메소드.
	 * 
	 * @param oriStr
	 *            :원본 문자열
	 * @param delChat
	 *            : 원본 문자열에서 삭제할 문자 하나
	 * @return 변경된 문자열 리턴.
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
			System.out.println("해당 문자가 문자열에 없습니다.");
			return delStr;
		}
	}
}
