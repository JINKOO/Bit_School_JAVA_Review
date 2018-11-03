package kr.ac.smu.day03;

public class Homework02 {

	public static void main(String[] args) {

		int step = 3;
		for (int dan = 2; dan <= 9; dan += step) {

			for (int i = 0; i <= 9; i++) {

				for (int j = dan; j <= 9 && j < dan + step; j++) { // for문 조건식에 논리 연산자가 와도 된다.
					if (i == 0) {
						System.out.printf("***%d단***\t", j);
					} else {
						System.out.printf("%d * %d = %d\t", j, i, j * i);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
