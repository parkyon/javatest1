package Thread;

import javax.swing.JOptionPane;

public class accdoune {
	String mode;
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
class MyThread66 implements Runnable{
	accdoune accd;
	public MyThread66(accdoune accd) {
		this.accd = accd;
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			accd.mode = JOptionPane.showInputDialog("출금할 금액 입력 : ");
			System.out.println(accd.mode);
			
			if(accd.mode != null)
				if(accd.mode.compareTo("q") == 0)    //q누르면 창이 닫힌다.
					return;
				accd.withdraw(Integer.parseInt(accd.mode));
			try {
				Thread.sleep(100);
		} 	catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}
			}
	
	}

}


