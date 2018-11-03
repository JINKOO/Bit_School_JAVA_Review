package kr.ac.smu.day07;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello world";
		
		int searchIdx = str.indexOf("e");
		System.out.println("\'e\' ���� ��ġ : " + searchIdx);
		
		searchIdx = str.indexOf("o");
		System.out.println("\'o\'�� ���� ��ġ : " + searchIdx);
		
		//indexOf() ���� ã���� �ϴ� �Լ��� ���ٸ� -1����
		searchIdx = str.indexOf("x");
		System.out.println("\'x\'�� ���� ��ġ : " + searchIdx);
		
		//lastindexOf(): �˻縦 ������ ���� �һ��̾�. index�� �Ųٷ�X
		searchIdx = str.lastIndexOf("o");
		System.out.println("\'o\'�� ������ ��ġ : " + searchIdx);
		
		searchIdx = str.lastIndexOf("world");
		System.out.println("\'world\'�� ���� ��ġ : " + searchIdx);
		
		System.out.println("-----------------------");
		
		searchIdx = str.indexOf("o", 5); //5���� ���� �˻縦 �����Ѵ�.
		System.out.println(searchIdx);
		
		//str���� o�� ��ġ�� ��� �˰� �ʹ�. => �ݺ��� ����.
		char ch = 'o';
		searchIdx = str.indexOf(ch, 0); //���� 4�� ����.
		//5���� �˻� ����.
		while(searchIdx != -1) { //���� : �˻��ߴµ� o�� ���̻� ����. -> searchIdx = -1�̸� Ż��
			System.out.println("\'" + ch + "\'" + searchIdx);
			searchIdx = str.indexOf(ch, searchIdx + 1);
		}
		
		char ch1 = 'l';
		searchIdx = -1; //while���� ������ �ʱ�� �վ����.
		while((searchIdx = str.indexOf(ch1, searchIdx + 1)) != -1) {
			System.out.println("\'" + ch1 + "\'" + searchIdx);
		}
		
		
		//�Ųٷ� �˻�
		String str2 = new String("Hello unicity");
		char ch2 = 'i';
		
		searchIdx = str2.length(); //14
		while((searchIdx = str2.lastIndexOf(ch2, searchIdx - 1)) != -1) {
			System.out.println("\'" + ch2 + "\'" + searchIdx);
		}
		
		
	
		
		
	}
}
