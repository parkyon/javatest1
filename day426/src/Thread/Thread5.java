package Thread;
//join���
public class Thread5 {
	static boolean data=false;
	public static void main(String[] args) {
		
	Thread m3 = new Thread(new MyThread3());
	m3.start();
	for (int i = 1; i<=5; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		try {
			m3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//m3.start();   //�̷��� ������
		System.out.println("������ �ٽ� ����");
		m3 = new Thread(new MyThread3());
		m3.start();
		
		try {
		m3.join();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main������ ����");
		
	}
		
}
	
	
class MyThread3 implements Runnable{

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
		System.out.println("myThread3 �����մϴ�.");
	}
	
}