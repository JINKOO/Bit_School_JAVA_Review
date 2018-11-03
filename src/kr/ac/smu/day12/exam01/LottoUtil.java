package kr.ac.smu.day12.exam01;

import java.util.Random;
import java.util.Scanner;

//로또 발생 기능.
public abstract class LottoUtil {

	private Scanner sc;
	private Random r;
	private int[] lottoNum = new int[6];
	
	public LottoUtil() {
	    sc = new Scanner(System.in);
		r = new Random();
		
	}
	
	public void setLottoNum() {
		for(int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = randomInt();
		}
	}
	
	public int[] getLottoNum() {
		return lottoNum;
	}
	
	public int scanInt() {
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public int randomInt() {
		int num = r.nextInt(45) + 1;
		return num;
	}
	
	public abstract void showLottoNum();
	
}
