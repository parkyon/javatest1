package day412;

public interface LottoInterface {
	public boolean isDuplicated(int [] arr , int num, int size) throws Exception;//중복확인
	public int randomUnsignedInteger(int min, int max) throws Exception;  //음수일경우에 예외가 생길수도 있다.
	public void createLotto(int []arr, int min, int max) throws Exception;
	/**
	 * @param win
	 * @param arr
	 * @return 로또 당첨등수
	 * -1
	 * @throws Exception
	 */
	public int rank(int[] win, int[] arr)throws Exception;

	

class Lottoim implements LottoInterface {

	@Override
	public boolean isDuplicated(int[] arr, int num, int size) throws Exception {
		if( size < 0) {
			throw new Exception("탐색할 갯수는 음시일 수 없음");
		}
		if(size> arr.length) {
			throw new Exception("탐색할 갯수는 배열의 크기보다 클수 없음");
		}
		
			for(int i=0; i<size; i++) {
				
				if(arr[i] == num)
					return true;
			
			
				}
			return false;
	}

	@Override
	public int randomUnsignedInteger(int min, int max) throws Exception {
		if(min < 0 || max <0)throw new Exception("음수를 랜덤으로  생성할수 없음");
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		
		}
		return (int)(Math.random()*
				(max-min+1))+min;
		
			
		
			
		// TODO Auto-generated method stub

	}

	@Override
	public void createLotto(int[] arr, int min, int max) throws Exception {
		// TODO Auto-generated method stub
		if(arr.length>Math.abs(max-min))
			throw new Exception("랜덤범위보다 배열의 크기가 큼");
			for (int cnt=0; cnt<arr.length;) {
			int tmp = randomUnsignedInteger(min, max);
			if(!isDuplicated(arr,tmp,cnt)) {
			arr[cnt] = tmp;
			cnt++;
			
			}
		}
	}

	

	@Override
	public int rank(int[] win, int[] arr) throws Exception {
		// TODO Auto-generated method stub
		int cnt = 0;//맞힌 개수
		boolean isBonus = false;
		
		
		if(win.length != 7 ||  arr.length  != 6) 
			throw new Exception("당첨번호 또는 생성 번호 갯수가 잘못되었습니다.");
		
		for(int i=0; i<arr.length; i++) {
			if(isDuplicated(arr,win[i],arr.length)) {
				cnt++;
			}
		}
		if(isDuplicated(arr,win[6], arr.length))
			isBonus = true;
		
		
		if(cnt == 6)
			return 1;
		else if(cnt == 5)
			if(isBonus)
			return 2;
			else
				return 3;
		else if(cnt == 4)
			return 4;
		else if(cnt == 3)
			return 5;
		else
			return -1;
	}
	public void prinArr(int[] arr) {
		for(int i= 0; i<arr.length; i++)
			System.out.print(arr[i] + "  ");
		System.out.println();
	}
}
	

}
