package kr.ac.smu.day06;

class Player {

	String name;
	String team;
	int backNum;

	Player() {
		this("�� �� ����");
	}

	Player(String name) {
		this(name, "�˼� ����");
	}

	Player(String name, String team) {
		this(name, team, -1);
	}

	Player(String name, String team, int backNum) {

		this.name = name;
		this.team = team;
		this.backNum = backNum;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.team);
		System.out.println(this.backNum);
	}
}

public class ConstructorMain02 {

	public static void main(String[] args) {

		Player p = new Player();
		Player p1 = new Player("�⼺��");
		Player p2 = new Player("�⼺��", "������ ��Ƽ");
		Player p3 = new Player("�⼺��", "������ ��Ƽ", 14);

		p.print();
		p1.print();
		p2.print();
		p3.print();
	}
}
