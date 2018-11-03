package kr.ac.smu.day07;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello world";
		
		int searchIdx = str.indexOf("e");
		System.out.println("\'e\' 시작 위치 : " + searchIdx);
		
		searchIdx = str.indexOf("o");
		System.out.println("\'o\'의 시작 위치 : " + searchIdx);
		
		//indexOf() 에서 찾고자 하는 함수가 없다면 -1리턴
		searchIdx = str.indexOf("x");
		System.out.println("\'x\'의 시작 위치 : " + searchIdx);
		
		//lastindexOf(): 검사를 끝에서 부터 할뿐이야. index도 거꾸로X
		searchIdx = str.lastIndexOf("o");
		System.out.println("\'o\'의 마지막 위치 : " + searchIdx);
		
		searchIdx = str.lastIndexOf("world");
		System.out.println("\'world\'의 시작 위치 : " + searchIdx);
		
		System.out.println("-----------------------");
		
		searchIdx = str.indexOf("o", 5); //5번지 부터 검사를 시작한다.
		System.out.println(searchIdx);
		
		//str에서 o의 위치를 모두 알고 싶다. => 반복문 쓴다.
		char ch = 'o';
		searchIdx = str.indexOf(ch, 0); //현재 4를 리턴.
		//5부터 검사 시작.
		while(searchIdx != -1) { //조건 : 검사했는데 o가 더이상 없다. -> searchIdx = -1이면 탈출
			System.out.println("\'" + ch + "\'" + searchIdx);
			searchIdx = str.indexOf(ch, searchIdx + 1);
		}
		
		char ch1 = 'l';
		searchIdx = -1; //while문은 무조건 초기식 잇어야해.
		while((searchIdx = str.indexOf(ch1, searchIdx + 1)) != -1) {
			System.out.println("\'" + ch1 + "\'" + searchIdx);
		}
		
		
		//거꾸로 검사
		String str2 = new String("Hello unicity");
		char ch2 = 'i';
		
		searchIdx = str2.length(); //14
		while((searchIdx = str2.lastIndexOf(ch2, searchIdx - 1)) != -1) {
			System.out.println("\'" + ch2 + "\'" + searchIdx);
		}
		
		
	
		
		
	}
}
