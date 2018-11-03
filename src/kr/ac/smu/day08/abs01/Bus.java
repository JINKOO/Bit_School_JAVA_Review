package kr.ac.smu.day08.abs01;

public abstract class Bus {

	private String name;    //버스 기종
	private int num;        //탑승 제원
	private String oilType; //경유 or CNG
	private boolean auto;   //자동 변속기 or 수동 변속기
	
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
