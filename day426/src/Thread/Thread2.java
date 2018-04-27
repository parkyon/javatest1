package Thread;

import javax.swing.JOptionPane;

public class Thread2 {
	static String data="";
	public static void main(String[] args)
	{	
		myThreadd m1 = new myThreadd();
		m1.start();
		
		data = JOptionPane.showInputDialog("문자열이력");
		System.out.println("입력바은 문자열:" + data);
	}
	
	
	
}	
class myThreadd extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<100; i++) {
			if(Thread2.data.compareTo("q")==0)    //위에 static로 했기때문에 이런식으로 구현
				break;
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}



