package Thread;
	//deamon Thread
public class Thread4 {
	static boolean data=false;
	public static void main(String[] args) {
		
	
			
			Thread m2 = new Thread(new myThreadddd2());
			m2.setDaemon(true);
			m2.start();
			
			
			for(int i = 0; i<20; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i == 9) 
					data =true;
					
				
			}
			
		
		}
		
	}
		
		
	class myThreadddd extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i =1; i<100; i++) {
				
				System.out.print("-");
				
		}
		}
		}
	
	class myThreadddd2 implements Runnable{

			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(3000);        //3초
					}catch (InterruptedException e){
						e.printStackTrace();
					}
						if(Thread4.data == true) {
							System.out.println("파일을 자동저장합니다");
						}
					}
				
			}
	}


