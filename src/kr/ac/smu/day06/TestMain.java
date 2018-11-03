package kr.ac.smu.day06;

public class TestMain {

	public static int[] newArr(int num) {
		
		int[] nArr = new int[num];
		for(int i = 0; i<nArr.length; i++) {
			nArr[i] = i*10;
		}
		return nArr;
	}
	
	public static void main(String[] args) {
	
		int num = 10;
		int[] sArr = newArr(num);
		
		for(int n : sArr) {
			System.out.print(n + " ");
		}
	}
}
