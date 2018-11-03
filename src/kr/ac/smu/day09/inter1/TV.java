package kr.ac.smu.day09.inter1;

public interface TV {

	public static final int MAX_VOLUMN = 50;
	public static final int MIN_VOLUMN = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void channelUp();
	public abstract void channelDown();
	public abstract void volumnUp();
	public abstract void volumnDown();
	void mute();
	
}
