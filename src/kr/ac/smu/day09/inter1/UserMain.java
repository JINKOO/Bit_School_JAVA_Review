package kr.ac.smu.day09.inter1;

public class UserMain {

	public static void main(String[] args) {
		
//		LGTV lgtv = new LGTV();
//		SamsumgTV samtv = new SamsumgTV();
		TV tv = new LGTV();
				
		tv.turnOn();
		tv.channelDown();
		tv.channelUp();
		tv.volumnUp();
		tv.volumnDown();
		tv.mute();
		tv.turnOff();
		
		System.out.println("====================");
		
		tv = new SamsumgTV();
		tv.turnOn();
		tv.channelUp();
		tv.channelDown();
		tv.volumnUp();
		tv.volumnDown();
		tv.mute();
		tv.turnOff();
		
	}
}
