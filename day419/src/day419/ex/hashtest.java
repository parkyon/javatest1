package day419.ex;

import java.util.HashSet;
import java.util.Iterator;



public class hashtest {
	//hashset �� set �׽�Ʈ
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(20);
		
		Iterator<Integer> it = hs.iterator();{ //�ݷ��� �����ӿ�ũ�� ������ �ҷ��ü��ִ�.
			while(it.hasNext()) {
				System.out.println((Integer)it.next());
			
			
		}
			
			
		}
		
		System.out.println("----------------");
		//�ζ� ���α׷� ó�� 7�� ����ϴ� ���α׷�
		HashSet<Integer> aa = new HashSet<Integer>();
		int min = 1;
		int max = 45;
		
		while(aa.size() < 6) {
			int num = (int)(Math.random()*
					(max-min+1))+min;
			
			
			aa.add(num);
			
			
			
			
		}
		Iterator<Integer> zz = aa.iterator();{ //�ݷ��� �����ӿ�ũ�� ������ �ҷ��ü��ִ�.
			while(zz.hasNext()) {
				
			
				System.out.println((Integer)zz.next());
			
			
			}
		}
	}
}

		
		
		
		
		



