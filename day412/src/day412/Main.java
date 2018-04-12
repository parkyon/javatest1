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
		catch(ArithmeticException ae) { //생성된 예외 겍체
			//예외 메시지 ㅜㅊㄹ력
			System.out.println("0으로  나눌수 없다: "+ ae.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException ie) { //생성된 예외 겍체
			System.out.println(ie.getMessage());
		}
		catch(NullPointerException ne) {
			System.out.println("NullPointer 예외");
		}
		catch(Exception e) {
			System.out.println("모든 예외처리");
		}
		finally {
			System.out.println("무조건 출력");
		}
	
	}
	
	public static int div(int a, int b) 
			throws ArithmeticException
	{
		if(b == 0)
			throw new ArithmeticException("0으로 나눌수 없습니다.");
		return a/b;
	}
	
	public static int count(int []arr, int size, int num)
	throws ArrayIndexOutOfBoundsException   //->없어도 되지만 예외가 생길수 있다고 알려주기 위해서 작성
	{
		int cnt = 0;
		for(int i = 0; i<size; i++) {
			if(i>=arr.length)
				throw new ArrayIndexOutOfBoundsException
				("배열의 크기 이상인번지에 접근불가");
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
	
