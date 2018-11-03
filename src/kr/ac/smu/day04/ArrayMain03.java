package kr.ac.smu.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		System.out.println("배열 초기화");
		System.out.print("arr1 : ");
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = (i+1) * 10;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("배열 복사");
		System.arraycopy(arr1, 0, arr2, 1, 4);
		
		System.out.print("arr2 : ");
		for(int num : arr2) {
			System.out.print(num + " ");
		}
	}
}
