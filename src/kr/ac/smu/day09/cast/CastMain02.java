package kr.ac.smu.day09.cast;
/*
 * ����� ����ȯ�� �׻�!
 * ������ ����ȯ�� �Ͼ �Ŀ� �� �� �־�...
 * 
 * �׳� ��¥��¥ 
 * Child01 c01 = new Parent();
 * ������ ����!
 * =>�θ� ��ӹ��� Child01ũ�Ⱑ Parent���� ũ�ϱ�!...
 * 
 * Child01 c01 = (Child01)new Parent();
 * ������ ������ �ƴ����� ���� ����!
 * =>���� Child01�κ��� �޸𸮿� �ȸ���� ����...
 * �̷��� �ϸ� �ȵ�.
 * 
 * �׻�!
 * Child01������ �����Ǿ����� Ȯ��!.
 * Parent p1 = new Child01(); //������ ����ȯ
 * �Ŀ� �� �� �־�!
 * �׸��� ��� �϶��� ������ ����.
 * 
 * Child01 c01 = new Child01(); 
 * �� ���Ŀ� ���ٸ�..??
 * ���� �� ����� ����ȯ�� ��..?? �׳� c01�̿��ؼ� �ڽ��� ������� ������.
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
