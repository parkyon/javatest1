package day46;

public class Main {

		public static void main(String[] args) {
			Child c = new Child();
			Child c2 = new Child(1,2,3);
			ChildOther co = new ChildOther();
			ChildOther co2 = new ChildOther(4,3,2,1);
			//c.prints();
			System.out.println("child x:"+c2.x);
			System.out.println("child y:"+c2.getY());
			System.out.println("child z:"+c2.getZ());
			
			
			System.out.println("childOther x:"+co2.x);
			System.out.println("childOhter y:"+co2.getY());
			System.out.println("childOher z:"+co2.getZ());
			System.out.println("childOher z:"+co2.num);

		}
}
class Parents{
	public int x;
	protected int y;
	private int z;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	public void prints() {
		System.out.println("�θ��Դϴ�");
		
	}
	public Parents() {
		System.out.println("�θ� ����Ʈ  �Դϴ�");
	}
	public Parents(int x , int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("�θ������ �����ε�");
	}

}

	
	class Child extends Parents{
		public void print() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(getZ()); 
		}
	 
	
	@Override
	public void prints() {
		System.out.println("�ڽ��Դϴ�");
	}
	public Child() {
		//super(); �� ������ �ִ�.
		System.out.println("�ڽ� ����Ʈ ������");
	}
	public  Child(int x, int y, int z) {
		super(x, y, z);
		System.out.println("�ڽ� ������ �����ε�");
	}

}

class ChildOther extends Parents{   //�ٸ� �ڽ� Ŭ���� �� Parents ���
	public int num;
	public ChildOther() {
		System.out.println("�ٸ� �ڽ� ����Ʈ ������");
	}
	public ChildOther(int x, int y, int z, int num) {
		super(x,y,z);   //���⼭ xyz�� �Ҵ� �Ҽ� ������ ���� ���⼭ �� ������ �ؼ� �ι� �� �ٿ� ���� �θ� Ŭ�������� xyz�� �ʱ�ȭ �϶�� �ϰ�  num���� ���⼭ ����
		this.num=num;
		System.out.println("�ٸ� �ڽ� ������ �����ε�");
	}
}
