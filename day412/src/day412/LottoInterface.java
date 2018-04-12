package day412;

public interface LottoInterface {
	public boolean isDuplicated(int [] arr , int num, int size) throws Exception;//�ߺ�Ȯ��
	public int randomUnsignedInteger(int min, int max) throws Exception;  //�����ϰ�쿡 ���ܰ� ������� �ִ�.
	public void createLotto(int []arr, int min, int max) throws Exception;
	/**
	 * @param win
	 * @param arr
	 * @return �ζ� ��÷���
	 * -1
	 * @throws Exception
	 */
	public int rank(int[] win, int[] arr)throws Exception;

	

class Lottoim implements LottoInterface {

	@Override
	public boolean isDuplicated(int[] arr, int num, int size) throws Exception {
		if( size < 0) {
			throw new Exception("Ž���� ������ ������ �� ����");
		}
		if(size> arr.length) {
			throw new Exception("Ž���� ������ �迭�� ũ�⺸�� Ŭ�� ����");
		}
		
			for(int i=0; i<size; i++) {
				
				if(arr[i] == num)
					return true;
			
			
				}
			return false;
	}

	@Override
	public int randomUnsignedInteger(int min, int max) throws Exception {
		if(min < 0 || max <0)throw new Exception("������ ��������  �����Ҽ� ����");
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
			throw new Exception("������������ �迭�� ũ�Ⱑ ŭ");
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
		int cnt = 0;//���� ����
		boolean isBonus = false;
		
		
		if(win.length != 7 ||  arr.length  != 6) 
			throw new Exception("��÷��ȣ �Ǵ� ���� ��ȣ ������ �߸��Ǿ����ϴ�.");
		
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

}
	

}
