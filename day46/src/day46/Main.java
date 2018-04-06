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
		System.out.println("부모입니다");
		
	}
	public Parents() {
		System.out.println("부모 디폴트  입니다");
	}
	public Parents(int x , int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("부모생성자 오버로딩");
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
		System.out.println("자식입니다");
	}
	public Child() {
		//super(); 가 숨겨져 있다.
		System.out.println("자식 디폴트 생성자");
	}
	public  Child(int x, int y, int z) {
		super(x, y, z);
		System.out.println("자식 생성자 오버로딩");
	}

}

class ChildOther extends Parents{   //다른 자식 클래스 도 Parents 상속
	public int num;
	public ChildOther() {
		System.out.println("다른 자식 디폴트 생성자");
	}
	public ChildOther(int x, int y, int z, int num) {
		super(x,y,z);   //여기서 xyz를 할당 할수 있지만 궂이 여기서 또 선언을 해서 두번 할 바에 차라리 부모 클래스에서 xyz를 초기화 하라고 하고  num값만 여기서 정의
		this.num=num;
		System.out.println("다른 자식 생성자 오버로딩");
	}
}
