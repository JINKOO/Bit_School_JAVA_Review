package kr.ac.smu.day08.exam;
/*
 * 1. ���簢��  2. ���簢��  3. �ﰢ��  4. ��
���� : 3
�ﰢ���� �����߽��ϴ�
�غ� 5, ���� 3�϶��� �ﰢ���� ���̴� XXX�Դϴ�
����ҷ�?(����� quit�Է�) => y

1. ���簢��  2. ���簢��  3. �ﰢ��  4. ��
���� : 2
���簢���� �����߽��ϴ�
���� 7, ���� 2�϶��� ���簢���� ���̴� XXX�Դϴ�
����ҷ�?(����� quit�Է�) => Y

1. ���簢��  2. ���簢��  3. �ﰢ��  4. ��
���� : 1
���簢���� �����߽��ϴ�
���� ���̰� 5�϶��� ���簢���� ���̴� XXX�Դϴ�
����ҷ�?(����� quit�Է�) => quit

 */
public class HomworkMain {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		int num = menu.choiceMenu();
		
		menu.process(num);
	}
}
