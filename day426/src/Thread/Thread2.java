package Thread;

import javax.swing.JOptionPane;

public class Thread2 {
	static String data="";
	public static void main(String[] args)
	{	
		myThreadd m1 = new myThreadd();
		m1.start();
		
		data = JOptionPane.showInputDialog("���ڿ��̷�");
		System.out.println("�Է¹��� ���ڿ�:" + data);
	}
	
	
	
}	
class myThreadd extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<100; i++) {
			if(Thread2.data.compareTo("q")==0)    //���� static�� �߱⶧���� �̷������� ����
				break;
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}



