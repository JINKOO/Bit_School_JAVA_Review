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
		
		case "ȫ�浿":
			data.add(name);
			data.sub(name);
			break;
		case "��Ӵ�":
			data.add(name);
			data.sub(name);
			break;
		case "�ƹ���":
			data.add(name);
			data.sub(name);
			break;
		}
	}
}
