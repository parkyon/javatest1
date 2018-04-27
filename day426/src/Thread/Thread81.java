package Thread;

import javax.swing.JOptionPane;

public class Thread81 {
	public static void main(String[] args){
		
		
	
	
	
		accdoune accd = new accdoune();
		Thread th = new Thread(new MyThread66(accd));
		th.start();
		
		while(true) {
			if(accd.mode !=null && accd.mode.compareTo("q")==0) {
				System.out.println("입금 종료");
				return;
			}
			accd.deposit(100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
}
	}
}
	

		
		
			
		


