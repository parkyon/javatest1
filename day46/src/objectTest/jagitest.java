package objectTest;

public class jagitest {
	public static void main(String[] args) {
	System.out.println(fac(5));	
	System.out.println(facRecursive(5));
	}
	public static int fac(int num) {
		if(num == 0)           //반복문을 이용한 팩토리얼 만들기
			return 1;
		else {
			int res = 1;
			for(int i =2; i<=num; i++)
				res *=i;
			return res;
			
			//-> 1*2*3*4*5
		}
	}
	
	//재귀 메소드 사용
	public static int facRecursive(int num) {
		
		if(num ==0)  //특수한 경우
			return 1;
		else if(num == 1)
			return 1;  // 재귀 메소드를 빠져나오기 위한 조건 
		else
			return num * facRecursive(num - 1); 
		
		/*[stack]
		 * 
		 * fac(1)
		 * fac(2)
		 * fac(3)
		 * fac(4)
		 *fac (5) 
		 */
		
		
		//-> 5! = 5*4!
		//-> 4! = 4*3!
		//-> 3! = 3*2!
	}
	
}
