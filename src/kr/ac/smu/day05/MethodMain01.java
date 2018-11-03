package kr.ac.smu.day05;

class Ko {
	
	public int Multiple(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
}

class Jin {
	
	int num1;
	int num2;
	int num3;
	
}

public class MethodMain01 {

	public void Print(char c, int num) {
		
		for(int i = 0; i<num; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static int Add(int num1, int num2) {
		
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		int sum = Add(3,5);
		System.out.println("두 수의 합은 : " + sum);
		
		MethodMain01 a = new MethodMain01();
		Ko b = new Ko();
		Jin[] cArr = new Jin[3];
		
		for(int i = 0; i<cArr.length; i++) {
			cArr[i] = new Jin();
		}
		
		for(int i = 0; i<cArr.length; i++) {
			System.out.print(cArr[i].num1 + " ");  //default값이므로 0출력.
		}
		
		int result = b.Multiple(3,4);
		System.out.println("두 수의 곱은 : " + result);
		
		a.Print('+', 5);
		System.out.println("고진권");
		a.Print('*', 15);
		System.out.println("고진권");
		a.Print('!', 25);
		System.out.println("고진권");
		a.Print('(', 50);
		System.out.println("고진권");
		
	}
}
