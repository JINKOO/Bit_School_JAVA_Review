package kr.ac.smu.day12.exam01;

public class LottoShow extends LottoUtil {

	private int num;
	
	public LottoShow() {
		// TODO Auto-generated constructor stub
		System.out.print("게임 수 입력 : ");
		num = scanInt();
	}

	@Override
	public void showLottoNum() {
		for(int i = 1; i <= num; i++) {
			System.out.print("게임 " + i + ":");
			setLottoNum();
			for(int j = 0; j < getLottoNum().length; j++) {
				System.out.print(getLottoNum()[j] + " ");
			}
			System.out.println();
		}
	}

}
