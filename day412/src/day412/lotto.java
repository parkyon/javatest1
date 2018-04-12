package day412;

import java.util.Scanner;

import day412.LottoInterface.Lottoim;

public class lotto {
	
	
	
	public static void main(String[] args) {
		int[] aaa = new int [7];  //당첨번호
		int []bbb = new int[6];   // 생성번호
		
		Lottoim c = new Lottoim();
		Lottoim b = new Lottoim();
		
		char isContinue = 'y';
		Scanner scan = new Scanner(System.in);
		while(isContinue == 'y' || isContinue == 'Y') {
			try {
				c.createLotto(aaa, 1, 45);
				System.out.print("당첨번호"+"  ");
				c.prinArr(aaa); 
			
				b.createLotto(bbb, 1, 45);
				System.out.print("생성번호"+ "  ");
				b.prinArr(bbb);
			
				
				System.out.println(c.rank(aaa,bbb));
			
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("더 하시겠습니까??(y/n)");
			isContinue = scan.next().charAt(0);
		}	
		
		
	}

}
