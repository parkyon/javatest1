package objectTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.setX(1);
		c1.setY(2);
		c1.setZ(3);
		Child c2 = new Child();
		c2.setX(1);
		c2.setY(2);
		c2.setZ(3);
		if(c1.equals(c2))
		System.out.println("����");
		else
			System.out.println("�ٸ�");
		
		System.out.println(c1);
		System.out.println(c2.toString());
		
		
		
		
	}

}


class Child //extends Object�� �����Ǿ�����
{
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
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
	private int y;
	private int z;
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Child))
			return false;

		Child c = (Child)obj;
		if(x == c.x && y == c.y && z == c.z)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return this.getClass().getName()+"@"+"X: "+x + ",y:"+y + ", z"+z;
	}
}

//��� �޼ҵ�� �޼ҵ�ȿ��� �ڱ� �ڽ��� ȣ�� �ϴ� ���.





