package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

/*
 * 
 * ���ܰ� Ÿ���� �ٸ��� ������ �߻� �� �� �� �ִ�.
 * catch block�� ������ �� �� �ִ�.
 * 
 * 
 */
public class ExceptionMain05 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		try {
			
			FileReader fr = new FileReader("a.txt");
			//�̰͸� ����..??
			String str = "abc";
			System.out.println("4��° ���� : " + str.charAt(3));
			
			Random r = null;
			System.out.println("����� ���� : " + r.nextInt(2));
		
		} catch (Exception e) { //Exception�� �θ� class�̴�.
			e.printStackTrace();
		}
		
//		}catch (FileNotFoundException fe) {
//			fe.printStackTrace();
//		}catch (StringIndexOutOfBoundsException se) {
//			se.printStackTrace();
//		}catch (NullPointerException ne) {
//			ne.printStackTrace();
//		}
		
		System.out.println("main end...");
	}
}
