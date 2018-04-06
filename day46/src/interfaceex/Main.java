package interfaceex;

public class Main {

		public static void main(String[] args) {

			
			Maths c = new Maths();
			//ũ������ ��ü�� = new ������();
					
			System.out.println(c.abs(5));
					
			System.out.println(c.abs(-5.1));
				
			System.out.println(c.pow(2,5));
		
			System.out.println(c.randomInt(100,111));
				
			System.out.printf("%.2f\n",c.getAreaCircle(3)); //�Ҽ��� 2��° �ڸ�����
		
			
			Test t1 = new Test();
			t1.num = 10;
			Test t2 = new Test();
			t2.num = 10;
			if(t1.equal(t2))
				System.out.println("�� ��ü�� ����");
			else
				System.out.println("�� ��ü�� �ٸ�");
		}
		
}



interface MathInterface{
	public final double PI = Math.PI;
	public int abs(int num);//���� num�� ���밪
	public double abs(double num);//�Ǽ� num�� ���밪
	public int pow(int a, int b); //a�� b����
	public int randomInt(int a, int b);//a ���� ũ�ų� ���� b���� ���� ������ ���ڸ� ���E�ϴ� �޼ҵ�
	public double getAreaCircle(int radius); //���� ���̸� ���ϴ� �޼ҵ�
}

class Maths implements MathInterface{

	@Override
	public int abs(int num) {
		// TODO Auto-generated method stub
		if(num>=0) 
			return num;
		else
			return -num;
	}
	@Override
	public double abs(double num) {
		// TODO Auto-generated method stub
		return num>=0? num:-num;
	} 
	@Override
	public int pow(int a, int b) {
		// TODO Auto-generated method stub

		return (int) Math.pow(a, b);
	}
	@Override
	public int randomInt(int a, int b) {
		
		return (int) (Math.random()*(b-a+1)+a);
		
	}
	@Override
	public double getAreaCircle(int radius) {
		return (double) (radius * radius * Math.PI);
	}
	
}
//���� ��ü�� �𸦋� ���ϴ¹��
interface Basic{
	public boolean equal(Object obj, Object obj1);
	public boolean equal(Object obj);
}
		
	
class Test implements Basic{
	int num;

	@Override
	public boolean equal(Object obj, Object obj1) {
		// TODO Auto-generated method stub
		if(((Test)obj).num == ((Test)obj1).num)  //
			return true;
		else
			return false;
	}
	
	public Test() {}

	@Override
	public boolean equal(Object obj) {
		if(((Test)obj).num == this.num) //���ڽŰ� �ٸ����� ��
			return true;
		else
			return false;
	}
}



