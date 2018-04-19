package day419.example;

public class Main {
	public static void main(String[] args) {
	A a = new A(10, 20);
	A a1 = new A(10,20);
	System.out.println(a.equals(a1));
	a.hashCode(); //Ŭ���� A�� �ɹ� a : 0~10000���� ����
	//���� Ŭ���� A�� ������ ��ü�� 10������. 10���� ���� ���ϴ°� �ƴ϶� �ؽ��ڵ尡 ����Ѱͳ��� ���� �ּҸ� ��
	System.out.println(a.toString());
	System.out.println(a);
	a1.a = 30;
	System.out.println(a);
		
}
	}

class A implements Cloneable{ 
	int a;
	int b;
	A(int a, int b){
		this.a= a;
		this.b= b;
	}
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof A) {    //null���� ���� �Ǵ��� �ϸ� ���ݴ� ������ ����ȴ�.
			A tmp = (A)obj;
			if(this.a == tmp.a && this.b == tmp.b)   //(A)obj.a �� �Ұ�� .a�� ��������� ���Ƽ� ������ ��� �׷��� ()ó�����ؼ� obj�� ��ȯ�ϰ� �״����� �Ѵ�.
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return a%100;
	}
	@Override
	public String toString() {
		return this.a+":" +this.b;
		//return this.getClass().getName()+"@"+ Integer.toHexString(this.hashCode());
	}
	@Override
	public Object clone(){
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	}

