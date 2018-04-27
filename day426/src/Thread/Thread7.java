package Thread;
//6의쓰레드 int,integer의차이==? 객체랑 클래스의 차리를 보여준다.
//Integer이나 int나 값을 복사해준다 그래서 따로 설정을한 Interger2를사용해서 구현  Integer2는 값이 아니라 주소값이 넘겨지도록함

public class Thread7 {
	public static void main(String[] args) {
	int data2 = 10;    //값을 복사한다
	Integer2 data1 = new Integer2(10);  // 객체랑 클래스의 차이를 보여
	ThreadEx1 th1 = new ThreadEx1(data1, data2);
	ThreadEx1 th2 = new ThreadEx1(data1, data2);
	th1.start();
	th2.start();
	
	}
}

class ThreadEx1 extends Thread{
	Integer2 data1;
	int data2;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			synchronized(this) {
			System.out.println("ThreadEx1 : data1 - "+data1.num+", data2 -"+data2);
			data1.num--;
			data2--;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	public ThreadEx1(Integer2 data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
}
class Integer2{
	int num;
	public Integer2(int n) {
		num = n;
	}
}