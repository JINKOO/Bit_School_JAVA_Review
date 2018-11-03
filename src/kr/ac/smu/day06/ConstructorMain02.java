package kr.ac.smu.day06;

class Player {

	String name;
	String team;
	int backNum;

	Player() {
		this("알 수 없음");
	}

	Player(String name) {
		this(name, "알수 없음");
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
		Player p1 = new Player("기성용");
		Player p2 = new Player("기성용", "스완지 시티");
		Player p3 = new Player("기성용", "스완지 시티", 14);

		p.print();
		p1.print();
		p2.print();
		p3.print();
	}
}
