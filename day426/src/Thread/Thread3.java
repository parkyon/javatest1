package Thread;

//우선순위 설정
public class Thread3 {
	static String data="";
	public static void main(String[] args)
	{	
		myThreaddd m1 = new myThreaddd();
		Thread m2 = new Thread(new myThreaddd2());
		m1.setPriority(1);
		m2.setPriority(10);
		m1.start();
		
		m2.start();
		
	
	}
	
}
	
	
class myThreaddd extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<100; i++) {
			
			System.out.print("-");
			
	}
	}
	}
class myThreaddd2 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int a=1; a<100; a++) {
				System.out.print("|");
				
			}
	}
}



