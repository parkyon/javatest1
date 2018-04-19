package day419.ex;

import java.util.HashSet;
import java.util.Iterator;



public class hashtest {
	//hashset 및 set 테스트
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(20);
		
		Iterator<Integer> it = hs.iterator();{ //콜랙션 프레임워크의 정보를 불러올수있다.
			while(it.hasNext()) {
				System.out.println((Integer)it.next());
			
			
		}
			
			
		}
		
		System.out.println("----------------");
		//로또 프로그램 처럼 7개 출력하는 프로그램
		HashSet<Integer> aa = new HashSet<Integer>();
		int min = 1;
		int max = 45;
		
		while(aa.size() < 6) {
			int num = (int)(Math.random()*
					(max-min+1))+min;
			
			
			aa.add(num);
			
			
			
			
		}
		Iterator<Integer> zz = aa.iterator();{ //콜랙션 프레임워크의 정보를 불러올수있다.
			while(zz.hasNext()) {
				
			
				System.out.println((Integer)zz.next());
			
			
			}
		}
	}
}

		
		
		
		
		



