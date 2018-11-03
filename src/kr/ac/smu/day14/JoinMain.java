package kr.ac.smu.day14;

/*
 * join()
 * Thread class에 있는 메소드.
 * 
 * 한 쪽 thread가 다 실행될때까지 기다림.
 * 단 실행되고 있는 thread가 무한루프이면 기다리는 thread는 계속 block상태.
 * 
 * 그래서 join() 안에 시간을 써준다.
 * 하지만 그 시간동안만 수행하며 그 시간동안 끝내지 못했을 경우
 * 다른 tread가 실행 될 수 있다.
 * 
 * =>동기화 필요 
 * 한번에 해당 코드 모두 실행.
 * 
 * 실행 되고 있는 thread에서 join만나면 바로 block? 아니면 ruunaable?
 */
class BoyThread extends Thread {

	public void run() {

		GirlThread gt = new GirlThread();

		System.out.println("(남자 친구) : 나는 그녀의 남자친구 입니다.");
		System.out.println("(남자 친구) : 오늘 그녀와 영화를 보기로 했습니다.");
		System.out.println("(남자 친구) : 영화가 곧 시작인데 아직 안옵니다.");
		System.out.println("(남자 친구) : 지금 그녀를 기다리고 있습니다.");

		gt.start();

		try {
			gt.join(5000); //5초가 지나면 girl이 무조건 runnable상태로 간다.
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("(남자 친구) : 5초 지났다 나간다!.");
//		System.out.println("(남자 친구) : 아 왔습니다!.");
//		System.out.println("(남자 친구) : 영화를 보러 갑니다.");

	}
}

class GirlThread extends Thread {

	public void run() {

		System.out.println("(여자친구) : 나는 여자친구 Thread입니다.");
		System.out.println("(여자친구) : 오늘 남자친구 애정도를 체크하려 합니다.");
		System.out.println("(여자친구) : 10초도 못기다리면 남자친구가 아니겠죠?");

		
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("(여자친구) : " + i + "초가 지났습니다.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("(여자친구) : 남자친구가 없습니다.....");
	}
}

public class JoinMain {

	public static void main(String[] args) {

		BoyThread bt = new BoyThread();
		bt.start();
	}
}
