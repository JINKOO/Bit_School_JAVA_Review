package kr.ac.smu.day07.exam;

public class Homework03 {

	public static int checkChar(String strData, char ch) {

		int count = 0;
		
		int i = 0;
		while(i < strData.length()) {
			if(strData.charAt(i++) == ch)
				count++;
		}
//		int num = -1;
//		
//		while (true) {
//			if ((num = strData.indexOf(ch, num + 1)) != -1) {
//				count++;
//			} else 
//				break;
//		}
		return count;
	}
}
