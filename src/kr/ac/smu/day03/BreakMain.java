package kr.ac.smu.day03;

/*
 * break���� continue��
 * 
 * break��
 * �Ϲ������� ���� ����� �ݺ����� Ż���Ѵ�.
 * if�������� ����ϸ� �ȸ�����.
 * �� if���� � �ݺ��� �ȿ� �ִٸ� break�� ������.
 * 
 * continue��
 * �ش� ���� �˻���ϰ� ���������� ���ư���.
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
