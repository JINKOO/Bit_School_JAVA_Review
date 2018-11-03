package kr.ac.smu.day08.exam;
/*
 * 1. 정사각형  2. 직사각형  3. 삼각형  4. 원
선택 : 3
삼각형을 선택했습니다
밑변 5, 높이 3일때의 삼각형의 넓이는 XXX입니다
계속할래?(종료시 quit입력) => y

1. 정사각형  2. 직사각형  3. 삼각형  4. 원
선택 : 2
직사각형을 선택했습니다
가로 7, 세로 2일때의 직사각형의 넓이는 XXX입니다
계속할래?(종료시 quit입력) => Y

1. 정사각형  2. 직사각형  3. 삼각형  4. 원
선택 : 1
정사각형을 선택했습니다
변의 길이가 5일때의 정사각형의 넓이는 XXX입니다
계속할래?(종료시 quit입력) => quit

 */
public class HomworkMain {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		int num = menu.choiceMenu();
		
		menu.process(num);
	}
}
