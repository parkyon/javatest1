package day412;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = new int[5];
		int res = 0;
		String s;
		A a= new A();
		
		
		try {
			div(1,1);
			int cnt = count(arr,6,0);
			
		}
		catch(ArithmeticException ae) { //������ ���� ��ü
			//���� �޽��� �̤�����
			System.out.println("0����  ������ ����: "+ ae.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException ie) { //������ ���� ��ü
			System.out.println(ie.getMessage());
		}
		catch(NullPointerException ne) {
			System.out.println("NullPointer ����");
		}
		catch(Exception e) {
			System.out.println("��� ����ó��");
		}
		finally {
			System.out.println("������ ���");
		}
	
	}
	
	public static int div(int a, int b) 
			throws ArithmeticException
	{
		if(b == 0)
			throw new ArithmeticException("0���� ������ �����ϴ�.");
		return a/b;
	}
	
	public static int count(int []arr, int size, int num)
	throws ArrayIndexOutOfBoundsException   //->��� ������ ���ܰ� ����� �ִٰ� �˷��ֱ� ���ؼ� �ۼ�
	{
		int cnt = 0;
		for(int i = 0; i<size; i++) {
			if(i>=arr.length)
				throw new ArrayIndexOutOfBoundsException
				("�迭�� ũ�� �̻��ι����� ���ٺҰ�");
			if(arr[i]  == num)
				cnt++;
		}
		return cnt;
	}
}
	
class A{
	int[] arr;
	
	void count() {
		arr[0] = 10;
	}
}
	
