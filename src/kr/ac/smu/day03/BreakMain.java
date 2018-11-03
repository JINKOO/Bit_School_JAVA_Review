package kr.ac.smu.day03;

/*
 * break문과 continue문
 * 
 * break문
 * 일반적으로 가장 가까운 반복문을 탈출한다.
 * if문에서의 사용하면 안먹힌다.
 * 단 if문이 어떤 반복문 안에 있다면 break문 먹힌다.
 * 
 * continue문
 * 해당 조건 검사안하고 증감식으로 돌아간다.
 * 
 */
public class BreakMain {

	public static void main(String[] args) {

		int num = 10;
		while (num < 100) {

			if (num != 20) {
				System.out.printf("%d\n", num);
			}
			
			else 
				break;
			num++;
		}

	}
}
