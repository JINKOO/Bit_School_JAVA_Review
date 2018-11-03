package kr.ac.smu.day09.cast;

/*
 * 객체 형변환(참조 변수의 타입을 잘 봐. 얘가 접근 가능 한건지 아닌지..)
 * 
 * 1.묵시적 형변환
 * 
 * super클래스 타입  = 자식 class타입;
 * Printer pr = new LGPrinter();
 * 단, 상속 관계일 때만 가능하다.
 * 상속은 무조건 2단계씩 생각하는 거야.
 * 
 * 항상 참조변수의 타입을 잘 보자.
 * super타입의 참조 변수 pr은 자식 class를 가리키지만(이때 자식class는 부모를 상속받으므로 부모의 멤버변수, 메소드를 가지고 있다.)
 * 부모 타입이므로 부모타입의 멤버변수, 메소드만 접근 가능하다.
 * (단, 오버라이딩된 메소드는 자식class의 메소드가 호출된다.)
 * 
 */
public class CastMain01 {

	// static void print(Child01 c) {
	// c.info();
	// }
	//
	// static void print(Child02 c) {
	// c.info();
	// }
	//
	// static void print(Child03 c) {
	// c.info();
	// }

	/*
	 * 여기서 Child100까지 있다면 일일히 여기다가 추가 해야됨... 더 좋은 방법은 없을까?? 여기서 매개변수에 묵시적 형변환 이용한다.
	 * 아래 방식을 쓰면 위에서와같이 일일히 쓸 필요가 없고 매개변수에서 묵시적 형변환을 이용하면 아래와 같이 간결해지지.
	 */

	static void print(Parent p) {
		p.info();

		/*
		 * 잠깐만! 근데 
		 * 매배변수로 들어오긴하는데 p가 정확히 무슨 객체를 가리키는지는 모르잖아.. 
		 * 나는 참조 변수 p로 객체마다(Child01,child02, child03, Parent) 의 각 멤버변수나 메소드에 접근 하고 싶은데.. => instanceof를 쓰자. 현재
		 * 가리키는 객체가 어떤 타입인지 알아볼 수 잇어! 그리고 명시적 형변환을 통해서 자식의 객체의 메소드나 멤버변수 접근 가능해.
		 */

		if (p instanceof Child01) {
			Child01 c01 = (Child01)p; //여기서 명시적 형변환이 일어난다.
			c01.sleep();
			c01.study();
		} else if (p instanceof Child02) {
			Child02 c02 = (Child02)p;
			c02.play();
			c02.sing();
			c02.info();
		} else if (p instanceof Child03) {
			Child03 c03 = (Child03)p;
			c03.info();
		} else if (p instanceof Parent) { //부모를 무조건 마지막에 물어봐야해.
			p.info();
		}
	}

	public static void main(String[] args) {

		Child01 c01 = new Child01();
		c01.info();
		c01.study();
		c01.sleep();

		Child02 c02 = new Child02();
		c02.info();
		c02.play();
		c02.sing();

		System.out.println("========================");

		Parent p = new Child01(); // 묵시적 객체형변환.
		p.info();
		// p.study();//이거 안되는 거임.

		/*
		 * System.out.println("name : " + p.name);
		 * 
		 * private변수는 무조건 자기자신의 class에서 만 접근가능 부모타입의 참조변수라고 다른 class에서 private접근 불가 무조건
		 * setter getter이용해야되.
		 */

		// p.setName("부모");
		System.out.println("name : " + p.getName());

		p = new Child02();
		p.info();

		System.out.println("========================");

		print(new Child01());
		print(new Child02());
		print(new Child03());
		print(new Parent());

		System.out.println("========================");
		Parent obj = Parent.getInstance();
		// 리턴 타입에 따라 바꿀 수 있다.
		obj.info();

	}
}
