package kr.ac.smu.day09.inter1;

public class LGTV implements TV {

	private boolean power;
	private int channelNo;
	private int volumn;
	private boolean mute;
	
	public LGTV() {
		// TODO Auto-generated constructor stub
		System.out.println("LGTV ½ÇÇà");	
		channelNo = 3;
		volumn = 10;
		
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		power = true;
		System.out.println("LGTV ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		power = false;
		System.out.println("LGTV OFF");
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
		
		mute = !mute;
		if(mute) {
			volumn = MIN_VOLUMN;
		} else {
			volumn++;
		}
	}
}
