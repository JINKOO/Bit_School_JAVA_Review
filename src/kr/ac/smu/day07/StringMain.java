package kr.ac.smu.day07;

public class StringMain {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str2 = new String("hello");
		String str3 = new String("HELLO");
		
		//주소 비교. 당연히 다르지...참조변수가 두개인데..
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		boolean bool = str.equals("ko");
		boolean bool2 = str.equalsIgnoreCase(str3);
		if(bool) {
			System.out.println("서로 같은 문자열 입니다.");
		} else {
			System.out.println("서로 다른 문자열 입니다.");
		}
		
		String prefix = "Hel";
		
		if(str.startsWith(prefix)) {
			System.out.println(prefix + "시작한다.");
		} else {
			System.out.println(prefix + "로 시작하지않는다.");
		}
		
		String strA = new String("banana");
		String strB = new String("boat");
		
		int compare = strA.compareTo(strB);
		if(compare == 0) {
			System.out.println("두 문자열은 같습니다.");
		} else if(compare < 0) {
			System.out.println(strA +  "<" +  strB);
		} else
			System.out.println(strA + ">" + strB);
		
		String[] names = { "홍길동", "이길순", "홍길순", "홍길동", "최철수", "박길동", "고길순" };

		System.out.println("<<이름이 홍길동이 사람 검색>>");
		for(String name : names) {
			if(name.equals("홍길동"))
				System.out.print(name + " ");
		}
		System.out.println();
		System.out.println("<<홍씨 성을 가진 사람 검색>>");
		for(String name : names) {
			if(name.startsWith("홍")) 
				System.out.print(name + " ");
		}
		
		System.out.println();
		System.out.println("<<이름에 길이 들어간 사람 검색>>");
		for(String name : names) {
			if(name.contains("길"))
				System.out.print(name + " ");
		}
		System.out.println();
		
		System.out.println("<<이름이 길동인 사람 검색>>");
		for(String name : names) {
			if(name.endsWith("길동"))
				System.out.print(name + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
