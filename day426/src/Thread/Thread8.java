package Thread;
///wait() notify()사용
public class Thread8 {

	public static void main(String[] args) {
		Account acc = new Account();
		Thread th = new Thread(new MyThread6(acc));
		th.start();
		
		while(true) {
			acc.deposit(100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
class MyThreadd42 implements Runnable{

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
class MyThread44 implements Runnable{
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
class MyThread45 implements Runnable{
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


class Account{
	int balance=0;
	synchronized void withdraw(int money) {
		
		while(balance < money) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			
		}
		balance -= money;
		System.out.println("출금액 : " + money + ",잔액:" + balance);
	}
	synchronized void deposit(int money) {
		balance += money;
		System.out.println("입금액" + money + ",잔액:" + balance);
		notify();
	}
	
}
class MyThread6 implements Runnable{
	Account acc;
	public MyThread6(Account acc) {
		this.acc = acc;
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			acc.withdraw(1000);
			try {
				Thread.sleep(100);
		} 	catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}
			}
	
	}
	
}
