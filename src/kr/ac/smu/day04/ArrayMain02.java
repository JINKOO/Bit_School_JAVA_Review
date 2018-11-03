package kr.ac.smu.day04;

import java.util.Arrays;

/*
 * 참조자료형 배열
 */
public class ArrayMain02 {

	public static void main(String[] args) {
		
		//"상명대" "자바" "교육" 문자열을 저장하는 strArr배열 생성
		
		String[] strArr1 = {"고진권", "정구일", "오양택", "박세훈"};  //{} 사용할때에는 []안에 크기 안쓴다.
		String[] strArr2 = new String[] {"2018년", "1월", "19일"};
		String[] strArr = new String[3];
		
		System.out.println("# 현재 strArr[i]에 들어있는 원소 출력");
		for(String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("# 초기화");
//		strArr[0] = "상명대";
//		strArr[1] = "자바";
//		strArr[2] = "교육";
		
		strArr = new String[] {"상명대", "자바", "교육"};
		System.out.println("# 현재 strArr[i]에 들어있는 원소 출력");
		for(int i = 0; i<strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		for(String str : strArr) {
			System.out.print(str + " ");
		}
		
		String str = new String(Arrays.toString(strArr2));
		System.out.println(str);
		
		Ko jin = new Ko();
		Ko[] arr = new Ko[2];
		
		arr[0] = new Ko();
		arr[1] = new Ko();
		
		for(int i = 0; i< arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
	}
}

class Ko {
	
}
