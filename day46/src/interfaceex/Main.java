package interfaceex;

public class Main {

		public static void main(String[] args) {

			
			Maths c = new Maths();
			//크래스명 객체명 = new 생성자();
					
			System.out.println(c.abs(5));
					
			System.out.println(c.abs(-5.1));
				
			System.out.println(c.pow(2,5));
		
			System.out.println(c.randomInt(100,111));
				
			System.out.printf("%.2f\n",c.getAreaCircle(3)); //소수점 2번째 자리까지
		
			
			Test t1 = new Test();
			t1.num = 10;
			Test t2 = new Test();
			t2.num = 10;
			if(t1.equal(t2))
				System.out.println("두 객체가 같음");
			else
				System.out.println("두 객체가 다름");
		}
		
}



interface MathInterface{
	public final double PI = Math.PI;
	public int abs(int num);//정수 num의 절대값
	public double abs(double num);//실수 num의 절대값
	public int pow(int a, int b); //a의 b제곱
	public int randomInt(int a, int b);//a 보다 크거나 같고 b보자 작은 랜덤한 숫자를 생섷하는 메소드
	public double getAreaCircle(int radius); //원의 넓이를 구하는 메소드
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
//비교할 객체를 모를떄 비교하는방법
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
		if(((Test)obj).num == this.num) //나자신과 다른것을 비교
			return true;
		else
			return false;
	}
}



