package day412;

public class Calculator{
	public static void main(String[] args) {
		Aaa c = new Aaa();
		
		System.out.println(c.sum(5, 7));
		System.out.println(c.sub(5, 6));
		
		double res = 0;
		try {
		res =	c.calculate(1, 4, '/');
		System.out.println(res);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			res = c.div(5,1);
			System.out.println(res);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	
		

	
	
		
		
	}

	
}



interface menu {
	public double sum(double a, double b) ;
	
	public double sub(double a, double b);
	public double mul(double a, double b) ;
	public double div(double a, double b)throws Exception;
	public double mod(double a, double b)throws Exception;
	public double calculate(double a, double b, char op)throws Exception;
	default void Test() {} //->디폴트 메소드
}

class Aaa implements menu{

	@Override
	public double sum(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(double a, double b)
	
	{
		
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) 
		throws Exception
		{
		
		if(b== 0)
			throw new Exception("0으로 나눌 수 없다");
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double mod(double a, double b)
			throws Exception{
		if(b==0)
			throw new Exception("0의 나머지를 구할 수없다.");
		// TODO Auto-generated method stub
		
		return a%b;
	}

	@Override
	public double calculate(double a, double b, char op)
	throws Exception
	{
		// TODO Auto-generated method stub
	
		
		switch (op) {
		case '+' : return sum(a,b);
		case '-' : return sub(a,b);		
		case '*' : return mul(a,b);		
		case '/' : return div(a,b);
		case '%' : return mod(a,b);
		default : throw new Exception("연산자 잘못 입력");
		}
	
	}
}
		

	


