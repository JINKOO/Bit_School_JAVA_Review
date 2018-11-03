package kr.ac.smu.day01;

import java.util.Random;
/**
 * First Document
 * @author : °íÁø±Çis
 * version 9.0.1 
 */
public class Document {

	/**
	 * @return return the random number 
	 */
	public static int RandomNum() {
		
		Random r = new Random();
		int num = r.nextInt();
		
		return num;
	}
}
