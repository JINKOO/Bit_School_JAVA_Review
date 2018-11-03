package kr.ac.smu.day04;

import java.util.Arrays;

/*
 *  배열 
 *  1.동일한 타입인 변수들의 집합.
 *  2.자바에서 배열은 heap영역에 공간을 할당하고 그 공간을 가리키는 변수를 생성한다.
 *    new 키워드 : heap영역에 공간을 할당하는 역할.
 *  3.기본 자료형 배열 // 참조 자료형 배열
 *    기본 자료형
 *    int[] arr; //현재 arr가 누굴 가리키는지 모른다.
 *    int[] arr = new int[10]; //각 원소는 0인 값을 가진다.
 *    
 *    참조 자료형배열
 *    2차원 배열의 형태를 가진다.
 *    사용자로 부터 얼마만큼의 공간을 할당할지 모르기 때문에 이를 가리키는 변수들의 집합인 참조변수 배열이 필요하다.
 *    String[] strarr = new String() {"상명대", "자바", "교육"};
 *    참조변수 배열은 heap영역에 만들어지고 
 *    각 참조 변수들이 해당 문자열이 있는 공간을 가리키도록 해야한다.
 *    
 *  4. Index
 *    index는 배열에서 원소들에 접근하기 위해 필요하다.
 *    배열의 시작 주소를 가리키고 있는 변수와 index를 통해 접근한다.
 *    시작주소를 알고 있다면 해당 타입이 몇 바이트인지 알기때문에 접근이 가능하다.
 *   -index의 배경
 *    int[] num = new int[5];
 *    num + sizeof(int)*0;
 *        + sizeof(int)*1;
 *        + sizeof(int)*2;...
 *    
 *    index를 변수화 해서 사용할 수 도 있다.
 *    배열에서 원소의 삽입과 삭제가 용이하다.
 *    
 *  5. 배열 원소 출력3가지
 *     
 *     int[] arr = new int[10];
 *     
 *     -index를 이용한 출력
 *      for(int i = 0; i<arr.length; i++)
 *     
 *     -1.5버전 이후 for문 (모든 원소를 출력. 부분 안됨. 에러 검출, 단어찾기에 용이)
 *      for(int num : arr)
 *      
 *     -Arrays.toString(arr)함수 사용(모든 원소를 출력. 부분 안됨.)
 *      []와 ,이용하여 각 원소가 출력된다.
 *    
 */
public class ArrayMain01 {

	public static void main(String[] args) {
		
		int[] iArr = new int[5];
		System.out.println("iArr : " + iArr);
		System.out.println("iArr의 원소 길이 : " + iArr.length);
		System.out.println("iArr[0] : " + iArr[0]);
		
		System.out.println("각원소 초기화 실행");
		
		for(int i = 0; i<iArr.length; i++) {
			iArr[i] = (i+1) * 10;
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("< Index를 이용한 출력 >");
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("< 1.5버전 이후의 for문 이용 출력 > ");
		for(int num : iArr) { //iArr.length만큼 반복한다. 입력용도로는 쓸 수 없다. 출력 용도로만.
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("< Arrays.toString()함수 이용 >"); //리턴값이 String형이다. 원소들을 문자열 형태로 출력 한다.
		String str = new String(Arrays.toString(iArr));
		System.out.println(str);
		
	}
}
