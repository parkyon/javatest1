package Thread;

//��Ƽ������
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
			Thread.sleep(500);					//0.5�ʸ��� ����.
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
				System.out.println(i+"��");
			
				Thread.sleep(1000);    //sleepsms millsŸ������ ����. �� 1�ʸ��� ����0
										//�ش� �����带 ��� ������Ų��..
			
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
				Thread.sleep(1000);    //sleepsms millsŸ������ ����. �� 1�ʸ��� ����0
										//�ش� �����带 ��� ������Ų��..
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}