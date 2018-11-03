package kr.ac.smu.day09.inter1;

public class SamsumgTV implements TV {

	private boolean power;
	private int channelNo;
	private int volumn;
	private boolean mute;
	
	public SamsumgTV() {
		// TODO Auto-generated constructor stub
		System.out.println("SamsungTV ½ÇÇà");
		channelNo = 11;
		volumn = 15;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		power = true;
		System.out.println("SamsungTV ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		power = false;
		System.out.println("SamsungTV OFF");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumnUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumnDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		
	}

	
}
