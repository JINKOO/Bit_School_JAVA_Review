package kr.ac.smu.day14.Homework;

public class GenerateThread extends Thread {

	private AccountData data;
	private String name;
	
	public GenerateThread(AccountData data, String name) {

		this.data = data;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		switch(name) {
		
		case "홍길동":
			data.add(name);
			data.sub(name);
			break;
		case "어머니":
			data.add(name);
			data.sub(name);
			break;
		case "아버지":
			data.add(name);
			data.sub(name);
			break;
		}
	}
}
