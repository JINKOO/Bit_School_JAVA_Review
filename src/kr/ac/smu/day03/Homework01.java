package kr.ac.smu.day03;

public class Homework01 {

	public static void main(String[] args) {

		int num = 1;
		int dan = 1;

		while (num <= 3) {

			for (int i = 0; i <= 10; i++) {
//				if(i==0) {
//					System.out.printf("%d단		%d단		%d단\t", dan+1, dan+2, dan+3);
//					System.out.println();
//					
//				} else {
					
				for (int j = 1; j <= 3; j++) {
					if (dan + j == 10 || i == 10)
						break;
					else if(i != 0)
						System.out.printf("%d * %d = %d\t", dan + j, i, (dan + j) * i);
					else
						System.out.print((dan + j) + "단\t");
				}
				System.out.println();
//				}
			}
			System.out.println();
			dan = dan + 3;
			num++;
		}
	}
}
