package Thread;

//멀티쓰레드
import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;

public class Thread1 {
	
	public static void main(String[] args) {
		
		myThread m1 = new myThread();
		
		Runnable r = new myThread2(); 
		Thread m = new Thread(r);
		Thread m2 = new Thread(new myThread2());
		m1.start();
		m2.start();
		/*for(int i =0; i<10000; i++)
		
		try {
			System.out.println("Ca");
			Thread.sleep(500);					//0.5초마다 쉰다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/

	}

}

class myThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10000; i++) {
			try {
				System.out.println(i+"초");
			
				Thread.sleep(1000);    //sleepsms mills타입으로 쉰다. 즉 1초마다 쉰다0
										//해당 쓰레드를 잠시 정지시킨다..
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class myThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int a=0; a<10000; a++) {
			try {
				System.out.println(a);
				Thread.sleep(1000);    //sleepsms mills타입으로 쉰다. 즉 1초마다 쉰다0
										//해당 쓰레드를 잠시 정지시킨다..
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}