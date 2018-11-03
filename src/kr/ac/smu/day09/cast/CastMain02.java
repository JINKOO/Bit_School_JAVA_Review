package kr.ac.smu.day09.cast;
/*
 * 명시적 형변환은 항상!
 * 묵시적 형변환이 일어난 후에 쓸 수 있어...
 * 
 * 그냥 다짜고짜 
 * Child01 c01 = new Parent();
 * 컴파일 오류!
 * =>부모를 상속받은 Child01크기가 Parent보다 크니까!...
 * 
 * Child01 c01 = (Child01)new Parent();
 * 컴파일 오류는 아니지만 실행 오류!
 * =>아직 Child01부분이 메모리에 안만들어 졌어...
 * 이렇게 하면 안되.
 * 
 * 항상!
 * Child01공간이 생성되었는지 확인!.
 * Parent p1 = new Child01(); //묵시적 형변환
 * 후에 쓸 수 있어!
 * 그리고 상속 일때만 가능한 것임.
 * 
 * Child01 c01 = new Child01(); 
 * 이 이후에 쓴다면..??
 * 굳이 왜 명시적 형변환을 해..?? 그냥 c01이용해서 자식의 멤버변수 접근해.
 * 
 */
public class CastMain02 {

	public static void print(Parent p) {
		
		if(p instanceof Child01) { //Parent p = new Child01();
			Child01 c01 = (Child01)p;
			p.info();
			c01.sleep();
			c01.study();
			c01.info();
		} else if(p instanceof Child02) {
			Child02 c02 = (Child02)p;
			c02.play();
			c02.sing();
		} else if(p instanceof Child03) {
			Child03 c03 = (Child03)p;
			c03.info();
		}
	}
	
	public static void main(String[] args) {
		
		CastMain02.print(new Child01());
//		CastMain02.print(new Child02());
//		CastMain02.print(new Child03());
		
	}
}
