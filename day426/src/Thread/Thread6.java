package Thread;
//쓰레드 동기화
public class Thread6 {

	public static void main(String[] args) {
		Runnable r = new MyThread5();   
		//Runnable r = new MyThread4();   
	Thread th1 = new Thread(r);
	Thread th2 = new Thread(r);
	
	th1.start();
	th2.start();
	
	}
	
}

class MyThreadd4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i= 1; i<=10; i++) {
			try {
				Thread.sleep(100);
						
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("myThread3 종료합니다.");
	}
	
}
class MyThread4 implements Runnable{
	Integer balance = new Integer(3000);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(balance>0) {
			synchronized(this) {
			if(balance >= 1000) {
				balance-= 1000;
				System.out.println(balance);
			}
			
				try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}	
		}
		
	}
}
class MyThread5 implements Runnable{
	Integer balance = new Integer(3000);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(balance>0) {
			withdraw();
		
		
			try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	
	}
	synchronized void withdraw() {
	
		if(balance >= 1000) {
			balance-= 1000;
			
			System.out.println(balance);
		}
	}
}
