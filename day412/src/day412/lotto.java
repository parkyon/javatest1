package day412;

import day412.LottoInterface.Lottoim;

public class lotto {
	
	
	
	public static void main(String[] args) {
		int[] aaa = new int [7];  //당첨번호
		int []bbb = new int[6];   // 생성번호
		
		Lottoim c = new Lottoim();
		Lottoim b = new Lottoim();
		
		
		try {
			c.createLotto(aaa, 1, 8);
		
			b.createLotto(bbb, 1, 8);
		
			
			System.out.println(c.rank(aaa,bbb));
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
