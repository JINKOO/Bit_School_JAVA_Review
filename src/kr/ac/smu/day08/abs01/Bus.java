package kr.ac.smu.day08.abs01;

public abstract class Bus {

	private String name;    //���� ����
	private int num;        //ž�� ����
	private String oilType; //���� or CNG
	private boolean auto;   //�ڵ� ���ӱ� or ���� ���ӱ�
	
	public Bus(String name, int num, String oilType, boolean auto) {
		this.name = name;
		this.num = num;
		this.oilType = oilType;
		this.auto = auto;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
	
//	public void setOilType(String oilType) {
//		this.oilType = oilType;
//	}
//	
//	public void setAuto(boolean auto) {
//		this.auto = auto;
//	}
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getOilType() {
		return oilType;
	}
	
	public boolean getAuto() {
		return auto;
	}
	
	public abstract void info(); 
	
}
