package kr.ac.smu.day08.abs01;

public class Hyundaibus extends Bus {

	public Hyundaibus(String name, int num, String oilType, boolean auto) {
		// TODO Auto-generated constructor stub
		super(name, num, oilType, auto);
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("버스 이름 : " + getName());
		System.out.println("탑승 제원 : " + getNum());
		System.out.println("유류 타입 : " + getOilType());
		System.out.println("자동 변속기? " + getAuto());	
	}
}
