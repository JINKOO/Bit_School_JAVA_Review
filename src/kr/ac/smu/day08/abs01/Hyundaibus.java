package kr.ac.smu.day08.abs01;

public class Hyundaibus extends Bus {

	public Hyundaibus(String name, int num, String oilType, boolean auto) {
		// TODO Auto-generated constructor stub
		super(name, num, oilType, auto);
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("���� �̸� : " + getName());
		System.out.println("ž�� ���� : " + getNum());
		System.out.println("���� Ÿ�� : " + getOilType());
		System.out.println("�ڵ� ���ӱ�? " + getAuto());	
	}
}
