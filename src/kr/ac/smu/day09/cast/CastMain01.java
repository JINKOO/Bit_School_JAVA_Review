package kr.ac.smu.day09.cast;

/*
 * ��ü ����ȯ(���� ������ Ÿ���� �� ��. �갡 ���� ���� �Ѱ��� �ƴ���..)
 * 
 * 1.������ ����ȯ
 * 
 * superŬ���� Ÿ��  = �ڽ� classŸ��;
 * Printer pr = new LGPrinter();
 * ��, ��� ������ ���� �����ϴ�.
 * ����� ������ 2�ܰ辿 �����ϴ� �ž�.
 * 
 * �׻� ���������� Ÿ���� �� ����.
 * superŸ���� ���� ���� pr�� �ڽ� class�� ����Ű����(�̶� �ڽ�class�� �θ� ��ӹ����Ƿ� �θ��� �������, �޼ҵ带 ������ �ִ�.)
 * �θ� Ÿ���̹Ƿ� �θ�Ÿ���� �������, �޼ҵ常 ���� �����ϴ�.
 * (��, �������̵��� �޼ҵ�� �ڽ�class�� �޼ҵ尡 ȣ��ȴ�.)
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
	 * ���⼭ Child100���� �ִٸ� ������ ����ٰ� �߰� �ؾߵ�... �� ���� ����� ������?? ���⼭ �Ű������� ������ ����ȯ �̿��Ѵ�.
	 * �Ʒ� ����� ���� �������Ͱ��� ������ �� �ʿ䰡 ���� �Ű��������� ������ ����ȯ�� �̿��ϸ� �Ʒ��� ���� ����������.
	 */

	static void print(Parent p) {
		p.info();

		/*
		 * ���! �ٵ� 
		 * �Ź躯���� �������ϴµ� p�� ��Ȯ�� ���� ��ü�� ����Ű������ ���ݾ�.. 
		 * ���� ���� ���� p�� ��ü����(Child01,child02, child03, Parent) �� �� ��������� �޼ҵ忡 ���� �ϰ� ������.. => instanceof�� ����. ����
		 * ����Ű�� ��ü�� � Ÿ������ �˾ƺ� �� �վ�! �׸��� ����� ����ȯ�� ���ؼ� �ڽ��� ��ü�� �޼ҵ峪 ������� ���� ������.
		 */

		if (p instanceof Child01) {
			Child01 c01 = (Child01)p; //���⼭ ����� ����ȯ�� �Ͼ��.
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
		} else if (p instanceof Parent) { //�θ� ������ �������� ���������.
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

		Parent p = new Child01(); // ������ ��ü����ȯ.
		p.info();
		// p.study();//�̰� �ȵǴ� ����.

		/*
		 * System.out.println("name : " + p.name);
		 * 
		 * private������ ������ �ڱ��ڽ��� class���� �� ���ٰ��� �θ�Ÿ���� ����������� �ٸ� class���� private���� �Ұ� ������
		 * setter getter�̿��ؾߵ�.
		 */

		// p.setName("�θ�");
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
		// ���� Ÿ�Կ� ���� �ٲ� �� �ִ�.
		obj.info();

	}
}
